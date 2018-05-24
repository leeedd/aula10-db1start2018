package br.com.db1.exercicio08;

public class Conta {

	private Integer numero;
	private Integer digitoVerificador;
	private Pessoa pessoa;
	private Agencia agencia;

	public void calcularDigitoVerificador() {

	}

	public Boolean valirdarDigitoVerificador() {
		return null;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Conta(Pessoa pessoa, Agencia agencia) {
		this.setPessoa(pessoa);
		this.setAgencia(agencia);
	}
}
