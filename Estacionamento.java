package com.company;

import java.util.ArrayList;

public class Estacionamento {
    ArrayList<Vaga> ocupacaoEstacionamento = new ArrayList<Vaga>();

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

        System.out.println("Quantidade total de vagas: "+ocupacaoEstacionamento.size()+"\n"); // teste
    }

    public double calcularOcupacao() { // retorna o percentual de ocupacao do estacionamento
        return 100;
    }

    public int verificaDisponibilidade( String tipoVaga) { // insere o veiculo na posicao correta
        int posicaoEstacionamento;
        posicaoEstacionamento = -1;
        
        for (int i = 0; i < this.ocupacaoEstacionamento.size(); i++) {
            Vaga obj = this.ocupacaoEstacionamento.get(i);
            Class temp = obj.getClass();

            if ( temp.getName().equals(tipoVaga)) {

                if ( !obj.statusOcupacao()) {
                    posicaoEstacionamento = i;
                    break;
                }
            }
        }

        return posicaoEstacionamento;
    }

    public void alocaVaga( int posicaoEstacionamento, Veiculo veiculo) {
        Vaga obj = this.ocupacaoEstacionamento.get(posicaoEstacionamento);

        obj.ocupaVaga( veiculo);
    }

    public boolean desocupaVaga() { // remove o veiculo da posicao correta
        return true;
    }
}
