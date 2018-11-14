package algoempires;

import algoempires.direccion.*;
import algoempires.entidad.edificio.Cuartel;
import algoempires.entidad.unidad.utilero.Aldeano;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AldeanoTest {


    @Test
    public void test01MuevoUnArqueroAbajo() throws CasilleroInvalidoException, DimensionesInvalidasError {

        Terreno terreno = new Terreno(10, 10);

        Casillero casillero = new Casillero(2, 2);

        Aldeano aldeano = new Aldeano(terreno, casillero);

        Direccion direccion = new DireccionAbajo();

        aldeano.desplazarHacia(direccion);

        assertTrue(aldeano.estaEnCasillero(new Casillero(2, 1)));

    }

    @Test
    public void test02MuevoUnArqueroArriba() throws CasilleroInvalidoException, DimensionesInvalidasError {

        Terreno terreno = new Terreno(10, 10);

        Casillero casillero = new Casillero(2, 2);

        Aldeano aldeano = new Aldeano(terreno, casillero);

        Direccion direccion = new DireccionArriba();

        aldeano.desplazarHacia(direccion);

        assertTrue(aldeano.estaEnCasillero(new Casillero(2, 3)));

    }

    @Test
    public void test03MuevoUnArqueroIzquierda() throws CasilleroInvalidoException, DimensionesInvalidasError {

        Terreno terreno = new Terreno(10, 10);

        Casillero casillero = new Casillero(2, 2);

        Aldeano aldeano = new Aldeano(terreno, casillero);

        Direccion direccion = new DireccionIzquierda();

        aldeano.desplazarHacia(direccion);

        //El problema son las id de los casilleros. Son distintas aunque tengan las mismas coordenadas.
        assertTrue(aldeano.estaEnCasillero(new Casillero(1, 2)));

    }

    @Test
    public void test04MuevoUnArqueroDerecha() throws CasilleroInvalidoException, DimensionesInvalidasError {

        Terreno terreno = new Terreno(10, 10);

        Casillero casillero = new Casillero(2, 2);

        Aldeano aldeano = new Aldeano(terreno, casillero);

        Direccion direccion = new DireccionDerecha();

        aldeano.desplazarHacia(direccion);

        assertTrue(aldeano.estaEnCasillero(new Casillero(3, 2)));

    }

    @Test
    public void test05MuevoUnArqueroArribaIzquierda() throws CasilleroInvalidoException, DimensionesInvalidasError {

        Terreno terreno = new Terreno(10, 10);

        Casillero casillero = new Casillero(2, 2);

        Aldeano aldeano = new Aldeano(terreno, casillero);

        Direccion direccion = new DireccionArribaIzquierda();

        aldeano.desplazarHacia(direccion);

        assertTrue(aldeano.estaEnCasillero(new Casillero(1, 3)));

    }

    @Test
    public void test06MuevoUnArqueroArribaDerecha() throws CasilleroInvalidoException, DimensionesInvalidasError {

        Terreno terreno = new Terreno(10, 10);

        Casillero casillero = new Casillero(2, 2);

        Aldeano aldeano = new Aldeano(terreno, casillero);


        Direccion direccion = new DireccionArribaDerecha();

        aldeano.desplazarHacia(direccion);

        assertTrue(aldeano.estaEnCasillero(new Casillero(3, 3)));

    }

    @Test
    public void test07MuevoUnArqueroAbajoIzquierda() throws CasilleroInvalidoException, DimensionesInvalidasError {

        Terreno terreno = new Terreno(10, 10);

        Casillero casillero = new Casillero(2, 2);

        Aldeano aldeano = new Aldeano(terreno, casillero);

        Direccion direccion = new DireccionAbajoIzquierda();

        aldeano.desplazarHacia(direccion);

        assertTrue(aldeano.estaEnCasillero(new Casillero(1, 1)));

    }

    @Test
    public void test08MuevoUnArqueroAbajoDerecha() throws CasilleroInvalidoException, DimensionesInvalidasError {

        Terreno terreno = new Terreno(10, 10);

        Casillero casillero = new Casillero(2, 2);

        Aldeano aldeano = new Aldeano(terreno, casillero);

        Direccion direccion = new DireccionAbajoDerecha();

        aldeano.desplazarHacia(direccion);

        assertTrue(aldeano.estaEnCasillero(new Casillero(3, 1)));

    }

    @Test
    public void test09aldeanoConstruyeUnaPlaza() throws DimensionesInvalidasError, CasilleroInvalidoException {

        Terreno terreno = new Terreno(10, 10);

        Casillero casilleroACrearAldeano = new Casillero(2, 2);

        Casillero casilleroAConstruir = new Casillero(3, 3);

        Casillero casilleroAConsultar = new Casillero(4, 4);

        Aldeano aldeano = new Aldeano(terreno, casilleroACrearAldeano);

        aldeano.construirPlazaCentral(casilleroAConstruir);

        assertTrue(terreno.estaOcupada(casilleroAConsultar));
    }

    @Test
    public void test10aldeanoConstruyeUnCuartel() throws DimensionesInvalidasError, CasilleroInvalidoException {

        Terreno terreno = new Terreno(10, 10);

        Casillero casilleroACrearAldeano = new Casillero(2, 2);

        Casillero casilleroAConstruir = new Casillero(3, 3);

        Casillero casilleroAConsultar = new Casillero(4, 4);

        Aldeano aldeano = new Aldeano(terreno, casilleroACrearAldeano);

        aldeano.construirCuartel(casilleroAConstruir);

        assertTrue(terreno.estaOcupada(casilleroAConsultar));
    }

    @Test
    public void test11aldeanoReparaUnCuartel() throws DimensionesInvalidasError, CasilleroInvalidoException {

        Terreno terreno = new Terreno(10, 10);

        Casillero casilleroACrearAldeano = new Casillero(4, 5);

        Casillero casilleroAConstruir = new Casillero(3, 3);

        Aldeano aldeano = new Aldeano(terreno, casilleroACrearAldeano);

        aldeano.construirCuartel(casilleroAConstruir);

        aldeano.reparar(casilleroAConstruir);

        Cuartel cuartelAConsultar = (Cuartel) terreno.getMapa().get(casilleroAConstruir);

        assertEquals(cuartelAConsultar.getVida(), 300);
    }
}
