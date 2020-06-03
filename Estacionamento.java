package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {
    public static Estacionamento INSTANCE;
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

    public void getOcupacaoDasVagas( ) { // lista todos os veiculos
        int posicaoEstacionamento;
        posicaoEstacionamento = -1;

        System.out.println("Posição / Ticket");
        for (int i = 0; i < this.ocupacaoEstacionamento.size(); i++) {
            Vaga vaga = getVaga(i);
            String ticket;

            if (vaga.getTicketAtual()==null) {
                ticket = "Desocupado.";
            } else {
                ticket = vaga.getTicketAtual().getTicketID();
            }

            System.out.println(i+": "+ticket);
        }
    }

    public void alocaVaga( int posicaoEstacionamento, Veiculo veiculo) {
        Vaga obj = this.ocupacaoEstacionamento.get(posicaoEstacionamento);

        obj.ocupaVaga( veiculo);
    }

    public boolean desocupaVaga() { // remove o veiculo da posicao correta
        return true;
    }

    public static Estacionamento getInstance( ) {
        Scanner scanner = new Scanner(System.in);

        if (INSTANCE == null) {
            System.out.println("Passe as quantidades referentes na sequência abaixo: ");
            System.out.println("Quantidade de vagas preferenciais: ");
            int qtdPreferencial = scanner.nextInt();
            System.out.println("Quantidade de vagas de carros: ");
            int qtdCarro = scanner.nextInt();
            System.out.println("Quantidade de vagas de moto: ");
            int qtdMoto = scanner.nextInt();
            System.out.println("Quantidade de vagas de camionetes: ");
            int qtdCamionete = scanner.nextInt();

            INSTANCE = new Estacionamento(qtdPreferencial, qtdCarro, qtdMoto, qtdCamionete);
        } else {
            System.out.println("Classe já criada!");
        }

        return INSTANCE;
    }

    public Vaga getVaga( int posicao) {
        Vaga retorno;
        if ((posicao+1)<=this.ocupacaoEstacionamento.size()) {
            Vaga obj = this.ocupacaoEstacionamento.get(posicao);
            retorno = obj;
        } else {
            retorno = null;
        }

        return retorno;
    }
}
