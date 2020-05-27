package com.company;

public class CabineControle {
    protected double tarifaBase;
    Estacionamento estacionamento;

    public CabineControle(double tarifaBase){
        this.tarifaBase = tarifaBase;
    }

    public void criaEstacionamento(int qtdPreferencial, int qtdCarro, int qtdMoto, int qtdCamionete){
        this.estacionamento = new Estacionamento( qtdPreferencial, qtdCarro, qtdMoto, qtdPreferencial);
    }

    public void efetuaEntrada( Veiculo veiculo){ // valida e efetua a entrada de veiculos no estacionamento
        int posicaoEstacionamento;
        Object tipoVeiculo = veiculo;

        posicaoEstacionamento = this.estacionamento.verificaDisponibilidade( "com.company.Vaga"+tipoVeiculo.getClass().getSimpleName()); //"com.company.VagaMoto
        System.out.println("Posição onde se pode estacionar: "+posicaoEstacionamento);

        if ( posicaoEstacionamento == -1) {
            System.out.println("Infelizmente não há vaga para o veiculo ocupar. \n");
        } else {
            this.estacionamento.alocaVaga( posicaoEstacionamento, veiculo);
            System.out.println("Veiculo estacionado! \n");
        }
    }

    public void efetuaSaida(){ // valida e efetua a saida de veiculos no estacionamento
    }

    public void calculaCobranca(){ // calcula o valor a ser pago pelo motorista
    }

    public void consultaVagas(){ // consulta as placas dos veiculos presentes no estacionamento
    }
}
