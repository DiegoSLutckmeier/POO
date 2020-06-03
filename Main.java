package com.company;

import java.util.Scanner;

public class Main {

    private double tarifaBase;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstacionamentoController estController = new EstacionamentoController();

        int opcaoEscolhida = 0;
        int opcaoTipoVeiculo = 0;
        int opcaoOperacaoTickets = 0;
        boolean retorno = false;

        while (!retorno) {
            System.out.println("Escolha uma operação do estacionamento: \n");
            System.out.println("1 - Criar cabine passando a tarifa básica. ");
            System.out.println("2 - Criar estacionamento passando a capacidade de vagas. ");
            System.out.println("3 - Entrada de veículo. ");
            System.out.println("4 - Saída de veículo. ");
            System.out.println("5 - Listar todos os veiculos que ocupam o estacionamento. ");
            System.out.println("6 - Operações de Tickets. ");
            System.out.println("0 - Exit. \n");
            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    estController.criaCabine();
                    continue;
                case 2:
                    estController.cabine.criaEstacionamento();
                    continue;
                case 3: // extende a opcao de selecionar o tipo de veiculo
                    boolean retornoInsercao = false;

                    while (!retornoInsercao) {
                        System.out.println("Escolha um tipo de veiculo: \n");
                        System.out.println("1 - Carro.");
                        System.out.println("2 - Moto.");
                        System.out.println("3 - Camionete.");
                        System.out.println("0 - Voltar. \n");
                        opcaoTipoVeiculo = scanner.nextInt();

                        switch (opcaoTipoVeiculo) {
                            case 1:
                                estController.criaCarro();
                                estController.cabine.efetuaEntrada(estController.veiculo);
                                continue;
                            case 2:
                                estController.criaMoto();
                                estController.cabine.efetuaEntrada(estController.veiculo);
                                continue;
                            case 3:
                                estController.criaCamionete();
                                estController.cabine.efetuaEntrada(estController.veiculo);
                                continue;
                            case 0:
                                retornoInsercao = true;
                        }
                    }

                    continue;
                case 4:
                    int posicao;
                    System.out.println("Qual posição gostaria de retirar? ");
                    posicao = scanner.nextInt();
                    estController.cabine.efetuaSaida(posicao);
                    continue;
                case 5:
                    estController.cabine.estacionamento.getOcupacaoDasVagas();
                    continue;
                case 6:
                    boolean retornoTickets = false;

                    while (!retornoTickets) {
                        System.out.println("\nEscolha uma operação: \n");
                        System.out.println("1 - Retornar histórico de tickets de uma vaga.");
                        System.out.println("0 - Voltar. \n");
                        opcaoOperacaoTickets = scanner.nextInt();

                        switch (opcaoOperacaoTickets) {
                            case 1:
                                int posicaoEstacionamento = 0;
                                System.out.println("Escolha uma posição para inspecionar: ");
                                posicaoEstacionamento = scanner.nextInt();
                                estController.cabine.estacionamento.getVaga(posicaoEstacionamento).getVagaTickets();
                                continue;
                            case 0:
                                retornoTickets = true;
                        }
                    }
                    continue;
                case 0:
                    retorno = true;
            }
        }

    }

}
