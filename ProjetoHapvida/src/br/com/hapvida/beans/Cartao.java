package br.com.hapvida.beans;

import java.time.LocalDate;

public class Cartao extends Pagamento {

	private String nomeCartao;
	private long numeroCartao;
	private int cvv;
	private LocalDate validade;
	
	public Cartao() {
		super();
	}

	public Cartao(int idPagamento, LocalDate dataPagamento, double valorPagamanto, int numeroTransacao,
			String nomeCartao, long numeroCartao, int cvv, LocalDate validade) {
		super(idPagamento, dataPagamento, valorPagamanto, numeroTransacao);
		this.nomeCartao = nomeCartao;
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
		this.validade = validade;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	
	
	
	
	
	
}
