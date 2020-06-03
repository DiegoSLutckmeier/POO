package com.company;

import java.util.Scanner;

public class EstacionamentoController {
    Scanner scanner = new Scanner(System.in);
    Veiculo veiculo;
    CabineControle cabine;

    public void criaCabine(){
        this.cabine = CabineControle.getInstance();
    }

    public void criaMoto( ) {
        System.out.println("Qual a placa do veículo? ");
        String placa = scanner.nextLine();

        this.veiculo = new Moto(placa);
    }

    public void criaCarro( ) {
        System.out.println("Qual a placa do veículo? ");
        String placa = scanner.nextLine();

        this.veiculo = new Carro(placa);
        System.out.println("Este carro é preferencial? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int retorno = scanner.nextInt();
        scanner.nextLine();

        if (retorno==1) {
            this.veiculo.setPreferencial();
        }
    }

    public void criaCamionete( ) {
        System.out.println("Qual a placa do veículo? ");
        String placa = scanner.nextLine();

        this.veiculo = new Camionete(placa);
        System.out.println("Esta camionete é preferencial? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int retorno = scanner.nextInt();
        scanner.nextLine();

        if (retorno==1) {
            this.veiculo.setPreferencial();
        }
    }

}
