package algoempires.entidad.edificio;

import algoempires.entidad.unidad.utilero.Aldeano;
import algoempires.jugador.Jugador;
import algoempires.tablero.CasilleroInvalidoException;
import algoempires.tablero.Posicion;
import algoempires.tablero.Region;
import algoempires.tablero.Terreno;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlazaCentral extends Edificio {

    private final int TAMANIO_HORIZONTAL = 2;
    private final int TAMANIO_VERTICAL = 2;
    private final int VIDA_INICIAL = 450;
    private final int TURNOS_DE_CONSTRUCCION_INICIAL = 3;
    private final int VELOCIDAD_DE_REPARACION = 25;

    public PlazaCentral(){
        super();
        this.setVida(getVidaInicial());
    }

    public Aldeano crearAldeano(){
        return new Aldeano();
    }

    @Override
    protected int getTamanioHorizontal() {
        return TAMANIO_HORIZONTAL;
    }

    @Override
    protected int getTamanioVertical() {
        return TAMANIO_VERTICAL;
    }

    @Override
    protected int getVidaInicial() {
        return VIDA_INICIAL;
    }

    @Override
    protected int getTurnosDeContruccionIniciales() {
        return TURNOS_DE_CONSTRUCCION_INICIAL;
    }

    @Override
    protected int getVelocidadDeReparacion() {
        return VELOCIDAD_DE_REPARACION;
    }

    @Override
    public void actualizarEntreTurnos(Jugador jugador) {
    }

}

