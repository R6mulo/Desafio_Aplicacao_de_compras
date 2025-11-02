package aplicacao;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("===== APLICAÇÃO DE COMPRAS =====");
        System.out.println("Informe o limite do cartão: R$ ");
        Double limite = entrada.nextDouble();
        entrada.nextLine(); // LIMPAR BUFFER

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int opcao;
        do {
            System.out.println("\n1 - Adicionar compra");
            System.out.println("2 - Exibir resumo e sair");
            System.out.println("3 - Cancelar e sair");
            System.out.println("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Descrição da compra: ");
                    String descricao = entrada.nextLine();

                    System.out.println("Valor da compra: ");
                    double valor = entrada.nextDouble();
                    entrada.nextLine();

                    Compra compra = new Compra(descricao, valor);

                    if (cartao.lancaCompra(compra)) {
                        System.out.println("Compra realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente! Compra não realizada.");
                    }
                    break;

                case 2:
                    cartao.exibirResumo();
                    System.out.println("\n===== FIM DA TRANSAÇÃO =====");
                    break;

                case 3:
                    cartao.cancelarCompras();
                    System.out.println("\n===== FIM DA TRANSAÇÃO =====");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }

        } while (opcao != 2 && opcao != 3);

        entrada.close();
    }
}