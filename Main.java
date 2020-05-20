package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EstacionamentoController estController = new EstacionamentoController();
        int opcaoEscolhida = 0;

        boolean retorno = false;

        while (!retorno) {
            System.out.println("Escolha uma operação do estacionamento: \n");
            System.out.println("1 - Criar cabine passando a tarifa básica.");
            System.out.println("2 - Criar estacionamento passando a capacidade de vagas(qtd Preferencial, qtd Carros, qtd Motos, qtd Camionetes)");
            System.out.println("3 - Criar veiculo para inserir.");
            System.out.println("4 - Retirar veiculo do estacionamento.");
            System.out.println("5 - Listar todas os veiculos que ocupam o estacionamento.");
            System.out.println("0 - Exit.");
            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    continue;
                case 2:
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
                case 5:
                    continue;
                case 0:
                    retorno = true;
            }
        }
        
    }

}
