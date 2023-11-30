package br.com.hapvida.beans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Estoque {

	private String fornecedorEstoque;
	private String loteEstoque;
	private String controleMedicacaoEstoque;
	private LocalDate dataEntradaEstoque;
	private LocalDate dataSaidaEstoque;
	private int quantidadeEntrada;
	private int quantidadeSaida;

	
	public String getFornecedorEstoque() {
		return fornecedorEstoque;
	}

	public void setFornecedorEstoque(String fornecedorEstoque) {
		this.fornecedorEstoque = fornecedorEstoque;
	}

	public String getLoteEstoque() {
		return loteEstoque;
	}

	public void setLoteEstoque(String loteEstoque) {
		this.loteEstoque = loteEstoque;
	}

	public String getControleMedicacaoEstoque() {
		return controleMedicacaoEstoque;
	}

	public void setControleMedicacaoEstoque(String controleMedicacaoEstoque) {
		this.controleMedicacaoEstoque = controleMedicacaoEstoque;
	}

	public LocalDate getDataEntradaEstoque() {
		return dataEntradaEstoque;
	}

	public void setDataEntradaEstoque(LocalDate dataEntradaEstoque) {
		this.dataEntradaEstoque = dataEntradaEstoque;
		this.quantidadeEntrada++;
	}

	public LocalDate getDataSaidaEstoque() {
		return dataSaidaEstoque;
	}

	public void setDataSaidaEstoque(LocalDate dataSaidaEstoque) {
		this.dataSaidaEstoque = dataSaidaEstoque;
		this.quantidadeSaida++;
	}

	public int getQuantidadeEntrada() {
		return quantidadeEntrada;
	}

	public void setQuantidadeEntrada(int quantidadeEntrada) {
		this.quantidadeEntrada = quantidadeEntrada;
	}

	public int getQuantidadeSaida() {
		return quantidadeSaida;
	}

	public void setQuantidadeSaida(int quantidadeSaida) {
		this.quantidadeSaida = quantidadeSaida;
	}

	public int getQuantidadeAtual() {
		return quantidadeEntrada - quantidadeSaida;
	}

	public boolean medicamentoNoEstoque() {
		return dataSaidaEstoque == null;
	}

	public void registrarSaida(LocalDate dataSaida, int quantidadeSaida) {
		if (medicamentoNoEstoque() && quantidadeSaida <= this.quantidadeEntrada) {
			setDataSaidaEstoque(dataSaida);
			this.quantidadeSaida += quantidadeSaida;
			System.out.println("Medicamento retirado do estoque. Data de Saída: "
					+ dataSaida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		} else {
			System.out.println("Erro: Medicamento não disponível em quantidade suficiente no estoque.");
		}
	}

	public void exibirInformacoes() {
		System.out.println("\nFornecedor: " + fornecedorEstoque + "\nLote: " + loteEstoque
				+ "\nControle de Medicamento: " + controleMedicacaoEstoque + "\nData de Entrada: "
				+ dataEntradaEstoque.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nData de Saída: "
				+ (dataSaidaEstoque != null ? dataSaidaEstoque.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
						: "N/A")
				+ "\nQuantidade de Entradas: " + quantidadeEntrada + "\nQuantidade de Saídas: " + quantidadeSaida
				+ "\nQuantidade Atual no Estoque: " + getQuantidadeAtual());

	}

}
