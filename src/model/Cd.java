package model;

public class Cd extends Produto {
	private int faixas;
	
	private Cadastro artista;

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public Cadastro getArtista() {
		return artista;
	}

	public void setArtista(Cadastro artista) {
		this.artista = artista;
	}
}
