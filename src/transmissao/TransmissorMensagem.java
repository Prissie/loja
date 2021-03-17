package transmissao;

import java.util.Date;

import model.Cadastro;

public class TransmissorMensagem {
	private Date data;
	
	private Cadastro destinatario;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	protected void enviar(String mensagem) {
		
	}

	public Cadastro getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Cadastro destinatario) {
		this.destinatario = destinatario;
	}
}
