package com.company;

import java.util.ArrayList;

public class Estacionamento {
    ArrayList placasPresentes = new ArrayList();
    ArrayList ocupacaoEstacionamento = new ArrayList();
//    int qtdPreferencial;
//    int qtdCarro;
//    int qtdMoto;
//    int qtdCamionete;

    public Estacionamento( int qtdPreferencial, int qtdCarro, int qtdMoto, int qtdCamionete){
        for (int i = 0; i < qtdPreferencial; i++) {
            VagaPreferencial vaga = new VagaPreferencial();
            this.ocupacaoEstacionamento.add(vaga);
        }

        for (int i = 0; i < qtdCarro; i++) {
            VagaCarro vaga = new VagaCarro();
            this.ocupacaoEstacionamento.add(vaga);
        }

        for (int i = 0; i < qtdCamionete; i++) {
            VagaCamionete vaga = new VagaCamionete();
            this.ocupacaoEstacionamento.add(vaga);
        }

        for (int i = 0; i < qtdMoto; i++) {
            VagaMoto vaga = new VagaMoto();
            this.ocupacaoEstacionamento.add(vaga);
        }

        System.out.println(ocupacaoEstacionamento.size()); // teste
    }

    public double calcularOcupacao() { // retorna o percentual de ocupacao do estacionamento
        return 100;
    }

    public void ocupaVaga( String tipoVaga) { // insere o veiculo na posicao correta

        for (int i = 0; i < this.ocupacaoEstacionamento.size(); i++) {
            Object obj = this.ocupacaoEstacionamento.get(i);
            Class temp = obj.getClass();

            if ( temp.getName() == tipoVaga) {
                System.out.println(i);
                System.out.println(obj);


                // não consigo retornar o method de VagaMoto = obj
            }
        }

    }

    public boolean desocupaVaga() { // remove o veiculo da posicao correta
        return true;
    }
}
