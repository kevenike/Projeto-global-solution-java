package br.com.hapvida.beans;

import java.time.LocalDate;

public class Pagamento {

	private int idPagamento;
	private LocalDate dataPagamento;
	private double valorPagamanto;
	private int numeroTransacao;
	
	public Pagamento() {
		super();
	}

	public Pagamento(int idPagamento, LocalDate dataPagamento, double valorPagamanto, int numeroTransacao) {
		super();
		this.idPagamento = idPagamento;
		this.dataPagamento = dataPagamento;
		this.valorPagamanto = valorPagamanto;
		this.numeroTransacao = numeroTransacao;
	}

	public int getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getValorPagamanto() {
		return valorPagamanto;
	}

	public void setValorPagamanto(double valorPagamanto) {
		this.valorPagamanto = valorPagamanto;
	}

	public int getNumeroTransacao() {
		return numeroTransacao;
	}

	public void setNumeroTransacao(int numeroTransacao) {
		this.numeroTransacao = numeroTransacao;
	}
	
	
	
	
	
}
