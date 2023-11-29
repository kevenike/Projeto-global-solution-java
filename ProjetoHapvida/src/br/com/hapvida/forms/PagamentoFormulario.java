package br.com.hapvida.forms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import br.com.hapvida.beans.Cartao;
import br.com.hapvida.beans.ConvenioMedico;
import br.com.hapvida.beans.Pagamento;
import br.com.hapvida.beans.Pix;

public class PagamentoFormulario {

    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pagamento exibirFormulario() {
        return criarPagamento();
    }

    private Pagamento criarPagamento() {
        System.out.println("Escolha o tipo de pagamento (1 - Pix, 2 - ConvenioMedico, 3 - Cartao): ");
        int opcaoPagamento = scanner.nextInt();

        switch (opcaoPagamento) {
            case 1:
                return criarPix();
            case 2:
                return criarConvenioMedico();
            case 3:
                return criarCartao();
            default:
                throw new IllegalArgumentException("Opção de pagamento inválida");
        }
    }

    private Pix criarPix() {
        System.out.println("Digite o ID do pagamento: ");
        int idPagamento = scanner.nextInt();
        System.out.println("Digite a Chave Pix: ");
        String chavePix = scanner.next();
        System.out.println("Digite o Valor do Pagamento: ");
        double valorPagamento = scanner.nextDouble();
        System.out.println("Digite o Número da Transação: ");
        int numeroTransacao = scanner.nextInt();

        Pix pix = new Pix(idPagamento, LocalDate.now(), valorPagamento, numeroTransacao, chavePix);
        imprimirDados(pix);
        return pix;
    }

    private ConvenioMedico criarConvenioMedico() {
        System.out.println("Digite o ID do pagamento: ");
        int idPagamento = scanner.nextInt();
        System.out.println("Digite o Número da Carteira do Convênio Médico: ");
        int numeroCarteira = scanner.nextInt();
        System.out.println("Digite a Data de Vencimento do Convênio Médico (no formato dd/MM/yyyy): ");
        String dataVencimentoStr = scanner.next();
        LocalDate dataVencimento = LocalDate.parse(dataVencimentoStr, dateFormatter);
        System.out.println("Digite o Valor do Pagamento: ");
        double valorPagamento = scanner.nextDouble();
        System.out.println("Digite o Número da Transação: ");
        int numeroTransacao = scanner.nextInt();

        ConvenioMedico convenio = new ConvenioMedico(idPagamento, LocalDate.now(), valorPagamento, numeroTransacao, numeroCarteira, dataVencimento);
        imprimirDados(convenio);
        return convenio;
    }

    private Cartao criarCartao() {
        System.out.println("Digite o ID do pagamento: ");
        int idPagamento = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Digite o Nome do Cartão: ");
        String nomeCartao = scanner.nextLine();
        System.out.println("Digite o Número do Cartão: ");
        long numeroCartao = scanner.nextLong();
        System.out.println("Digite o CVV do Cartão: ");
        int cvv = scanner.nextInt();
        System.out.println("Digite o Valor do Pagamento: ");
        double valorPagamento = scanner.nextDouble();
        System.out.println("Digite o Número da Transação: ");
        int numeroTransacao = scanner.nextInt();
        System.out.println("Digite a Validade do Cartão (no formato MM/yyyy): ");
        String validadeStr = scanner.next();
        LocalDate validade = LocalDate.parse("01/" + validadeStr, dateFormatter);

        Cartao cartao = new Cartao(idPagamento, LocalDate.now(), valorPagamento, numeroTransacao, nomeCartao, numeroCartao, cvv, validade);
        imprimirDados(cartao);
        return cartao;
    }

    private void imprimirDados(Pagamento pagamento) {
        System.out.println("\nDetalhes do pagamento:");
        System.out.println("ID do Pagamento: " + pagamento.getIdPagamento());
        System.out.println("Data do Pagamento: " + pagamento.getDataPagamento().format(dateFormatter));
        System.out.println("Valor do Pagamento: " + pagamento.getValorPagamanto());
        System.out.println("Número da Transação: " + pagamento.getNumeroTransacao());

        if (pagamento instanceof Pix) {
            Pix pix = (Pix) pagamento;
            System.out.println("Chave Pix: " + pix.getChavePix());
        } else if (pagamento instanceof ConvenioMedico) {
            ConvenioMedico convenio = (ConvenioMedico) pagamento;
            System.out.println("Número da Carteira: " + convenio.getNumeroCarteira());
            System.out.println("Data de Vencimento: " + convenio.getDataVaencimento().format(dateFormatter));
        } else if (pagamento instanceof Cartao) {
            Cartao cartao = (Cartao) pagamento;
            System.out.println("Nome do Cartão: " + cartao.getNomeCartao());
            System.out.println("Número do Cartão: " + cartao.getNumeroCartao());
            System.out.println("CVV: " + cartao.getCvv());
            System.out.println("Validade: " + cartao.getValidade().format(dateFormatter));
        }
    }
}


