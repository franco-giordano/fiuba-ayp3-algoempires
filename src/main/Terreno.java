package main;

public class Terreno {

	private Parcela[][] parcelas;

	Terreno(int tamanioHorizontal, int tamanioVertical) {

		parcelas = new Parcela[tamanioHorizontal][tamanioVertical];

	}

	boolean estaOcupada(int coordenadaHorizontal, int coordenadaVertical) {

		return parcelas[coordenadaHorizontal][coordenadaVertical].estaOcupada();

	}
	
}
