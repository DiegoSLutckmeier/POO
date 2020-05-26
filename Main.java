package com.company;

import java.util.Scanner;

public class Main {

    private double tarifaBase;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstacionamentoController estController = new EstacionamentoController();

        int opcaoEscolhida = 0;
        int opcaoTipoVeiculo = 0;
        boolean retorno = false;

        while (!retorno) {
            System.out.println("Escolha uma operação do estacionamento: \n");
            System.out.println("1 - Criar cabine passando a tarifa básica.");
            System.out.println("2 - Criar estacionamento passando a capacidade de vagas(qtd Preferencial, qtd Carros, qtd Motos, qtd Camionetes)");
            System.out.println("3 - Entrada de veículo.");
            System.out.println("4 - Saída de veículo.");
            System.out.println("5 - Listar todas os veiculos que ocupam o estacionamento.");
            System.out.println("0 - Exit.");
            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    estController.criaCabine(10);
                    System.out.println(estController.cabine.tarifaBase); // teste
                    continue;
                case 2:
                    estController.cabine.criaEstacionamento(10,10,10,10);
                    continue;
                case 3: // extende a opcao de selecionar o tipo de veiculo
                    System.out.println("Escolha um tipo de veiculo: \n");
                    System.out.println("1 - Carro.");
                    System.out.println("2 - Moto.");
                    System.out.println("3 - Camionete.");
                    System.out.println("0 - Voltar.");
                    opcaoTipoVeiculo = scanner.nextInt();

                    switch(opcaoTipoVeiculo) {
                        case 1:
                            estController.criaCarro("AGS5F26");
                            System.out.println(estController.veiculo);
                            continue;
                        case 2:
                            estController.criaMoto("ALS4O78");
                            System.out.println(estController.veiculo);
                            continue;
                        case 3:
                            estController.criaCamionete("ALD8W15");
                            System.out.println(estController.veiculo);
                            continue;
                        case 0:
                            continue;
                    };
                    continue;
                case 4:
                    continue;
                case 5:
                    continue;
                case 9:
                    estController.cabine.efetuaEntrada();
                    continue;
                case 0:
                    retorno = true;
            }
        }

    }

}
