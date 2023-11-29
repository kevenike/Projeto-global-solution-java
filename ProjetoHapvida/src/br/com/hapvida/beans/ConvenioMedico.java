package br.com.hapvida.beans;

import java.time.LocalDate;

public class ConvenioMedico extends Pagamento {
	
	private int numeroCarteira;
	private LocalDate dataVaencimento;
	
	public ConvenioMedico() {
		super();
	}

	public ConvenioMedico(int idPagamento, LocalDate dataPagamento, double valorPagamanto, int numeroTransacao,
			int numeroCarteira, LocalDate dataVaencimento) {
		super(idPagamento, dataPagamento, valorPagamanto, numeroTransacao);
		this.numeroCarteira = numeroCarteira;
		this.dataVaencimento = dataVaencimento;
	}

	public int getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(int numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public LocalDate getDataVaencimento() {
		return dataVaencimento;
	}

	public void setDataVaencimento(LocalDate dataVaencimento) {
		this.dataVaencimento = dataVaencimento;
	}

	
	
	
}
