package com.company;

import java.util.Date;

public class Vaga {
    Veiculo veiculoVaga;
    Date tempoEntrada;

    public void ocupaVaga( Veiculo veiculo) {
        this.veiculoVaga = veiculo;
        this.tempoEntrada = new Date();
    }

    public boolean statusOcupacao() {
        boolean retorno;
        if (this.veiculoVaga == null) {
            retorno = false;
        } else {
            retorno = true;
        }

        return retorno;
    }
}
