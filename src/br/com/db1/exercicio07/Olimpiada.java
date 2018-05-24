package br.com.db1.exercicio07;

public class Olimpiada {

	private Integer ano;
	private Modalidade modalidade;
	private Sede sede;
	private Pessoa pessoa;

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	
	public Olimpiada(Modalidade modalidade, Sede sede, Pessoa pessoa) {
		this.modalidade = modalidade;
		this.sede = sede;
		this.pessoa = pessoa;
	}
	
	
	
}
