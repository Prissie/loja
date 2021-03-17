package venda;

import java.util.Date;

import model.Cadastro;

public class Pedido {
	private int id;
	private Date data;
	private Double valorTotal;
	
	private PedidoItem itens;
	private Cadastro cliente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public PedidoItem getItens() {
		return itens;
	}
	public void setItens(PedidoItem itens) {
		this.itens = itens;
	}
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
}
