package br.com.hapvida.beans;

public class Paciente {
	
	private int idPaciente;
	private String nomePaciente;
	private String sobrenomePaciente;
	private String cpfPaciente;
	private String SexoPaciente;
	
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getSobrenomePaciente() {
		return sobrenomePaciente;
	}
	public void setSobrenomePaciente(String sobrenomePaciente) {
		this.sobrenomePaciente = sobrenomePaciente;
	}
	public String getCpfPaciente() {
		return cpfPaciente;
	}
	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	public String getSexoPaciente() {
		return SexoPaciente;
	}
	public void setSexoPaciente(String sexoPaciente) {
		SexoPaciente = sexoPaciente;
	}
	
	
}
