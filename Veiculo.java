package com.company;

public class Veiculo {
    protected String placa;
    protected String modelo;
    protected String fabricante;
    boolean preferencial = false;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setPreferencial() {
        this.preferencial = true;
    }

    public String getPlaca() {
        return this.placa;
    }
}
