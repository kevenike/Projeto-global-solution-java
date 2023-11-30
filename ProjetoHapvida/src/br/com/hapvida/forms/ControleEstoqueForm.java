package br.com.hapvida.forms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.hapvida.beans.Estoque;

public class ControleEstoqueForm {

	public Estoque exibirFormulario() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("=== Controle de Estoque ===");

		System.out.print("Fornecedor: ");
		String fornecedor = scanner.next();

		System.out.print("Lote: ");
		String lote = scanner.next();

		System.out.print("Controle de Medicamento: ");
		String controleMedicacao = scanner.next();

		System.out.print("Data de Entrada (dd/MM/yyyy): ");
		String dataEntradaStr = scanner.next();
		LocalDate dataEntrada = LocalDate.parse(dataEntradaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		System.out.print("Quantidade de Entrada: ");
		int quantidadeEntrada = scanner.nextInt();

		System.out.print("Data de Saída (dd/MM/yyyy) (Deixe em branco se não houver saída): ");
		String dataSaidaStr = scanner.next();
		LocalDate dataSaida = null;
		if (!dataSaidaStr.isBlank()) {
			dataSaida = LocalDate.parse(dataSaidaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		}

		System.out.print("Quantidade de Saída: ");
		int quantidadeSaida = scanner.nextInt();
		
		Estoque estoque = new Estoque();
		
		estoque.setFornecedorEstoque(fornecedor);
		estoque.setLoteEstoque(lote);
		estoque.setControleMedicacaoEstoque(controleMedicacao);
		estoque.setDataEntradaEstoque(dataEntrada);
		estoque.setQuantidadeEntrada(quantidadeEntrada);
		estoque.setDataSaidaEstoque(dataSaida);
		estoque.setQuantidadeSaida(quantidadeSaida);
		estoque.exibirInformacoes();

		return(estoque);
		

	}
	
}
