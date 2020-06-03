package com.company;

import java.util.Observer;
import java.util.Scanner;

public class CabineControle {

    private static CabineControle INSTANCE;
    protected double tarifaBase;
    Estacionamento estacionamento;

    public CabineControle(double tarifaBase){
        this.tarifaBase = tarifaBase;
    }

    public void criaEstacionamento(){
        this.estacionamento = Estacionamento.getInstance();
    }

    public void efetuaEntrada( Veiculo veiculo){ // valida e efetua a entrada de veiculos no estacionamento
        int posicaoEstacionamento;
        Object tipoVeiculo = veiculo;
        String tipo;

        if (veiculo.preferencial==true) {
            tipo = "Preferencial";
        } else {
            tipo = tipoVeiculo.getClass().getSimpleName();
        }

        posicaoEstacionamento = this.estacionamento.verificaDisponibilidade( "com.company.Vaga"+tipo); //"com.company.VagaMoto
        System.out.println("Posição onde se pode estacionar: "+posicaoEstacionamento);

        if ( posicaoEstacionamento == -1) {
            System.out.println("Infelizmente não há vaga para o veiculo ocupar. \n");
        } else {
            this.estacionamento.alocaVaga( posicaoEstacionamento, veiculo);
            System.out.println("Veiculo estacionado! \n");
        }
    }

    public void efetuaSaida( int posicaoVeiculo){ // valida e efetua a saida de veiculos no estacionamento
        if (posicaoVeiculo < this.estacionamento.ocupacaoEstacionamento.size()) {
            Vaga vaga = this.estacionamento.getVaga(posicaoVeiculo);
            if (vaga.statusOcupacao()) {
                this.calculaCobranca(vaga);
            } else {
                System.out.println("Não existe veículo nesta vaga.");
            }
        } else {
            System.out.println("Essa vaga não existe no estacionamento.");
        }

    }

    public void calculaCobranca( Vaga vaga){ // calcula o valor a ser pago pelo motorista
        Ticket tkt = vaga.getTicketAtual();

        //efetua a cobrança
        tkt.setTempoSaida();
        System.out.println("Tarifa base: "+this.tarifaBase);
        System.out.println("Ticket do veículo: "+tkt.getTicketID().toString());
        System.out.println("Entrada no estacionamento: "+tkt.getTempoEntrada().toString());
        System.out.println("Saída do estacionamento: "+tkt.getTempoSaida().toString());

        //reseta as infos da vaga
        vaga.resetaVaga();
    }

    public void consultaVagas(){ // consulta as placas dos veiculos presentes no estacionamento
    }

    public static CabineControle getInstance( ) {
        Scanner scanner = new Scanner(System.in);

        if (INSTANCE == null) {
            System.out.println("Passe a tarifa base: ");
            double tarifaBase = scanner.nextDouble();
            INSTANCE = new CabineControle(tarifaBase);
            System.out.println("Tarifa base: "+tarifaBase+"\n");
        } else {
            System.out.println("Classe já criada!");
        }

        return INSTANCE;
    }
}
