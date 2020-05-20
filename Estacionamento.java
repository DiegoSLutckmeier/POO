package com.company;

import java.util.ArrayList;

public class Estacionamento {
    ArrayList placasPresentes = new ArrayList();
    int qtdPreferencial;
    int qtdCarro;
    int qtdMoto;
    int qtdCamionete;

    public Estacionamento( int qtdPreferencial, int qtdCarro, int qtdMoto, int qtdCamionete){
        VagaPreferencial vagasPreferenciais[] = new VagaPreferencial[qtdPreferencial];
        VagaCarro vagasCarros[] = new VagaCarro[qtdCarro];
        VagaMoto vagasMotos[] = new VagaMoto[qtdMoto];
        VagaCamionete vagasCamionetes[] = new VagaCamionete[qtdCamionete];
    }

    public double calcularOcupacao() { // retorna o percentual de ocupacao do estacionamento
        return 100;
    }

    public boolean ocupaVaga() { // insere o veiculo na posicao correta
        return true;
    }

    public boolean desocupaVaga() { // remove o veiculo da posicao correta
        return true;
    }
}
