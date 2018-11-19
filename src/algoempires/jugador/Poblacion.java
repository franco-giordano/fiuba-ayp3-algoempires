package algoempires.jugador;

import algoempires.entidad.unidad.Unidad;
import algoempires.tablero.Posicion;

import java.util.ArrayList;
import java.util.HashMap;

public class Poblacion {

    private HashMap<Posicion,Unidad> unidades;
    private final int MAXIMO_POBLACION=50;

    public Poblacion(){

        unidades= new HashMap<>();
    }


    public void agregar(Posicion posicion, Unidad unidad){
        unidades.put(posicion, unidad);
    }

    public void quitar(Posicion posicionDeLaUnidadAEliminar){
        unidades.remove(posicionDeLaUnidadAEliminar);
    }



    public boolean seLlegoAlMaximo(){
        return unidades.size()==50;
    }
}
