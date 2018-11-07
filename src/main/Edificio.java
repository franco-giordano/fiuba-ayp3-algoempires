package main;

public abstract class Edificio extends Entidad {

	private int turnosDeConstruccion;
	private int tamanio;

	public Edificio(int vidaRecibida, int costoRecibido, int turnosDeConstruccionRecibidos, int tamanioRecibido) {
		super(vidaRecibida, costoRecibido);
		this.turnosDeConstruccion = turnosDeConstruccionRecibidos;
		this.tamanio = tamanioRecibido;
	}

	public int getTurnosDeConstruccion() {
		return this.turnosDeConstruccion;
	}

	public int getTamanio() {
		return this.tamanio;
	}
}
