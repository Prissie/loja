package model;

public class Livro extends Produto {
	private int paginas;
	
	private Cadastro editora;

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Cadastro getEditora() {
		return editora;
	}

	public void setEditora(Cadastro editora) {
		this.editora = editora;
	}
}
