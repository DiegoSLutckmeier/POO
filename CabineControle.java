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

    public void efetuaEntrada(){ // valida e efetua a entrada de veiculos no estacionamento
        this.estacionamento.ocupaVaga("com.company.VagaMoto");
    }

    public void efetuaSaida(){ // valida e efetua a saida de veiculos no estacionamento
    }

    public void calculaCobranca(){ // calcula o valor a ser pago pelo motorista
    }

    public void consultaVagas(){ // consulta as placas dos veiculos presentes no estacionamento
    }
}
