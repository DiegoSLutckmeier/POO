package com.company;

public class EstacionamentoController {
    double tarifaHora;
    Object veiculo;

    public EstacionamentoController(double tarifaHora){
        this.tarifaHora = tarifaHora;
    }

    public void criaEstacionamento(int qtdPreferencial, int qtdCarro, int qtdMoto, int qtdCamionete){
        Estacionamento estacionamento = new Estacionamento( qtdPreferencial, qtdCarro, qtdMoto, qtdPreferencial);
    }

    public void criaMoto( String placa) {
        this.veiculo = new Moto(placa);
    }

    public void criaCarro( String placa) {
        this.veiculo = new Carro(placa);
    }

    public void criaCamionete( String placa) {
        this.veiculo = new Camionete(placa);
    }

    public void efetuaEntrada(){ // valida e efetua a entrada de veiculos no estacionamento
    }

    public void efetuaSaida(){ // valida e efetua a saida de veiculos no estacionamento
    }

    public void calculaCobranca(){ // calcula o valor a ser pago pelo motorista
    }

    public void consultaVagas(){ // consulta as placas dos veiculos presentes no estacionamento
    }
}
