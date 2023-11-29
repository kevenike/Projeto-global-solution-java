package br.com.hapvida.beans;


public class Medicacao {
	
	private String laboratorioMedicacao;
	private String nomeMedicacao;
	private double quantidadeMedicacao;
	private double valorMedicacao;
	private String categoriaMedicacao;
	
	
	public String getLaboratorioMedicacao() {
		return laboratorioMedicacao;
	}
	public void setLaboratorioMedicacao(String laboratorioMedicacao) {
		this.laboratorioMedicacao = laboratorioMedicacao;
	}
	public String getNomeMedicacao() {
		return nomeMedicacao;
	}
	public void setNomeMedicacao(String nomeMedicacao) {
		this.nomeMedicacao = nomeMedicacao;
	}
	public double getQuantidadeMedicacao() {
		return quantidadeMedicacao;
	}
	public void setQuantidadeMedicacao(double quantidadeMedicacao) {
		this.quantidadeMedicacao = quantidadeMedicacao;
	}
	public double getValorMedicacao() {
		return valorMedicacao;
	}
	public void setValorMedicacao(double valorMedicacao) {
		this.valorMedicacao = valorMedicacao;
	}

	public String getCategoriaMedicacao() {
		return categoriaMedicacao;
	}
	public void setCategoriaMedicacao(String categoriaMedicacao) {
		this.categoriaMedicacao = categoriaMedicacao;
	}
	
	public String toString() {
		return "\nLaboratorio: " + laboratorioMedicacao + "\nNome da Medicação: " + nomeMedicacao + "\nDosagem: " + quantidadeMedicacao +
				"\nValor da Medicacao: " + valorMedicacao + "\nCategoria da Medicação: " + categoriaMedicacao ;
	}
	
	
}
