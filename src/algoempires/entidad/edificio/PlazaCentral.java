package algoempires.entidad.edificio;

import algoempires.entidad.unidad.utilero.Aldeano;
import algoempires.jugador.Jugador;

public class PlazaCentral extends Edificio {

    private final int VIDA_INICIAL = 450;
    private final int TURNOS_DE_CONSTRUCCION_INICIAL = 3;


    public PlazaCentral(){
        super();

        TAMANIO_HORIZONTAL = 2;
        TAMANIO_VERTICAL = 2;
        VELOCIDAD_DE_REPARACION = 25;
        RANGO_VISION = 0;
    }

    @Override
    protected int getTurnosDeConstruccionInicial() {
        return TURNOS_DE_CONSTRUCCION_INICIAL;
    }


    @Override
    protected int getVidaInicial() {
        return VIDA_INICIAL;
    }

    public Aldeano crearAldeano() {
        return new Aldeano();
    }


    @Override
    public void actualizarEntreTurnos(Jugador jugador) {
    }

}

