package br.com.hapvida.forms;

import java.util.Scanner;

import br.com.hapvida.beans.Farmacia;

public class FarmaciaForm {

	public Farmacia exibirFormulario() {
		Scanner scanner = new Scanner(System.in);
		Farmacia farmacia = new Farmacia();

		System.out.println("====== Formulário Farmácia ======");

		System.out.print("Informe o ID do funcionário: ");
		farmacia.setIdFuncionario(scanner.nextInt());

		scanner.nextLine(); 

		System.out.print("Informe o endereço da farmácia: ");
		farmacia.setEnderecoFarmacia(scanner.nextLine());

		int opcao;

		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Registrar Entrada do Funcionário");
			System.out.println("2 - Registrar Saída do Funcionário");
			System.out.println("0 - Sair do Sistema");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				farmacia.registrarEntradaFuncionario();
				break;
			case 2:
				farmacia.registrarSaidaFuncionario();
				break;
			case 0:
				System.out.println("Saindo do sistema.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}

		} while (opcao != 0);

		scanner.close();

		return farmacia;
	}

}
