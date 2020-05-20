package com.company;

public class EstacionamentoController {
    Object veiculo;

    public void criaCabine(double tarifaBase){
        CabineControle cabine = new CabineControle(tarifaBase);
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
    
}
