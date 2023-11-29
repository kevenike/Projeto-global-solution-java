package br.com.hapvida.beans;

import java.time.LocalDate;

public class Farmacia {
	
	private int idFarmacia;
	private int idFuncionario;
	private LocalDate horarioDoFuncionario;
	private String enderecoFarmacia;
	private Estoque estoque;
	private Medicacao medicacao;
	private Paciente paciente;
	
	public int getIdFarmacia() {
		return idFarmacia;
	}
	public void setIdFarmacia(int idFarmacia) {
		this.idFarmacia = idFarmacia;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public LocalDate getHorarioDoFuncionario() {
		return horarioDoFuncionario;
	}
	public void setHorarioDoFuncionario(LocalDate horarioDoFuncionario) {
		this.horarioDoFuncionario = horarioDoFuncionario;
	}
	public String getEnderecoFarmacia() {
		return enderecoFarmacia;
	}
	public void setEnderecoFarmacia(String enderecoFarmacia) {
		this.enderecoFarmacia = enderecoFarmacia;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public Medicacao getMedicacao() {
		return medicacao;
	}
	public void setMedicacao(Medicacao medicacao) {
		this.medicacao = medicacao;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
}
