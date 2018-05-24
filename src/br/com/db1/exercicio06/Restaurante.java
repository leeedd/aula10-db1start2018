package br.com.db1.exercicio06;

import java.util.Date;
import java.util.List;

import br.com.db1.exercicio04.Telefone;

public class Restaurante {

	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;
	private List<Telefone> telefones;
	private Pedido pedidos;
	private Endereco enderecos;
	
	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal){
		return;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}


	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}


	public Boolean getServeJantar() {
		return serveJantar;
	}


	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}


	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}


	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}


	public List<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}


	public Endereco getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(Endereco enderecos) {
		this.enderecos = enderecos;
	}


	public Pedido getPedidos() {
		return pedidos;
	}


	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}



	
}
