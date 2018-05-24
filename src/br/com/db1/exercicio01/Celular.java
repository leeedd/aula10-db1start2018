package br.com.db1.exercicio01;

public class Celular {

	private String operadora;
	private Double tamanhoTela;
	private String marca;
	private Boolean dualChip;

	public Boolean temSinal() {

		return dualChip;

	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public Double getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(Double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
