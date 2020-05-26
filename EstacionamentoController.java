package com.company;

public class EstacionamentoController {
    Object veiculo;
    CabineControle cabine;

    public void criaCabine(double tarifaBase){
        this.cabine = new CabineControle(tarifaBase);
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
