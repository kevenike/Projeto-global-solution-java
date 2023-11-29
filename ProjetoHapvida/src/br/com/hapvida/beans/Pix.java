package br.com.hapvida.beans;

import java.time.LocalDate;

public class Pix extends Pagamento {

	private String chavePix;

	public Pix() {
		super();
	}

	public Pix(int idPagamento, LocalDate dataPagamento, double valorPagamanto, int numeroTransacao, String chavePix) {
		super(idPagamento, dataPagamento, valorPagamanto, numeroTransacao);
		this.chavePix = chavePix;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	
	
	
	
}
