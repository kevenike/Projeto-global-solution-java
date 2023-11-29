package br.com.hapvida.forms;

import java.util.Scanner;

import br.com.hapvida.beans.Medicacao;

public class MedicacaoForm {

	public Medicacao exibirFormulario() {
		Scanner scanner = new Scanner(System.in);
		
		Medicacao medicacao = new Medicacao();
		
		System.out.println("======Medicação======");
		
		System.out.println("Laboratorio Medicação: ");
		String laboratorioMedicacao = scanner.nextLine();
		
		System.out.println("Nome da Medicção: ");
		String nomeMedicacao = scanner.nextLine();

		System.out.println("Quantidade da Medicação: ");
		double quantidadeMedicacao = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Valor da Medicação: ");
		double valorMedicacao = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Categoria da Medicação: ");
		String categoriaMedicacao = scanner.nextLine();
		
		medicacao.setLaboratorioMedicacao(laboratorioMedicacao);
		medicacao.setNomeMedicacao(nomeMedicacao);
		medicacao.setQuantidadeMedicacao(quantidadeMedicacao);
		medicacao.setValorMedicacao(valorMedicacao);
		medicacao.setCategoriaMedicacao(categoriaMedicacao);
		
		System.out.println(medicacao.toString());
		
		return medicacao;
	}
}
