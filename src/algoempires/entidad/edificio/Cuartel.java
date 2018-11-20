package algoempires.entidad.edificio;

import algoempires.entidad.unidad.guerrero.Arquero;
import algoempires.entidad.unidad.guerrero.Espadachin;
import algoempires.jugador.Jugador;
import algoempires.tablero.PosicionInvalidaException;

public class Cuartel extends Edificio {

    private final int VIDA_INICIAL = 250;
    private final int TURNOS_DE_CONSTRUCCION_INICIAL = 3;


    public Cuartel(Jugador jugador) throws PosicionInvalidaException {
        super(jugador);

        TAMANIO_HORIZONTAL = 2;
        TAMANIO_VERTICAL = 2;
        VELOCIDAD_DE_REPARACION = 50;
        RANGO_VISION = 1;
        COSTO = 50;
    }

    @Override
    protected int getTurnosDeConstruccionInicial() {
        return TURNOS_DE_CONSTRUCCION_INICIAL;
    }


    @Override
    protected int getVidaInicial() {
        return VIDA_INICIAL;
    }

    public Espadachin crearEspadachin() throws PosicionInvalidaException {
        return new Espadachin(jugadorPropietario);
    }

    public Arquero crearArquero() throws PosicionInvalidaException {
        return new Arquero(jugadorPropietario);
    }


    @Override
    public void actualizarEntreTurnos(Jugador jugador) {
    }


    //METODO DE TESTEO
    public int getVidaActual() {
        return this.vida;
    }
}

