package com.company;

public class Carro extends Veiculo{
    boolean preferencial;

    public Carro( String placa) {
        this.placa = placa;
    }
    
    public void setPreferencial(boolean preferencial){
        this.preferencial = preferencial;
    }
}
