package br.com.hapvida.forms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayMenu implements DisplayForms {

	public void exibir() {
		List<String> opcoesMenu = new ArrayList<>();

		opcoesMenu.add("\n[ 7 ] - SAIR");
		opcoesMenu.add("[ 1 ] - CONTROLE DE ESTOQUE");
		opcoesMenu.add("[ 2 ] - FARMACIA");
		opcoesMenu.add("[ 3 ] - MEDICAÇÃO");
		opcoesMenu.add("[ 4 ] - PACIENTE");
		opcoesMenu.add("[ 5 ] - PAGAMENTO");

		Boolean exibindoMenu = true;

		Scanner scanner = new Scanner(System.in);

		while (exibindoMenu) {
			for (String op : opcoesMenu) {
				System.out.println(op);
			}

			System.out.println("ESCOLHA UMA OPÇÃO PARA OPERAR: ");
			String opcaoEscolhida = scanner.next();

			switch (opcaoEscolhida) {
			case "7":
				exibindoMenu = false;
				System.out.println("PROGRAMA FECHADO");
				break;

			case "1":
				ControleEstoqueForm controleDisplay = new ControleEstoqueForm();
				controleDisplay.exibirFormulario();
				break;
			case "2":
				FarmaciaForm farmaciaDisplay = new FarmaciaForm();
				farmaciaDisplay.exibirFormulario();
				break;
			case "3":
				MedicacaoForm medicacaoDisplay = new MedicacaoForm();
				medicacaoDisplay.exibirFormulario();
				break;
			case "4":
				PacienteForm pacienteDisplay = new PacienteForm();
				pacienteDisplay.exibirFormulario();
				break;
			case "5":
				PagamentoFormulario pagamentoDisplay = new PagamentoFormulario();
				pagamentoDisplay.exibirFormulario();
				break;
			default:
				System.out.println("\nOPÇÃO INVALIDA, SELECIONE UMA OPÇÃO VÁLIDA!");
				break;

			}
		}

	}

}
