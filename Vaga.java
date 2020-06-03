package com.company;

import java.util.Date;
import java.util.ArrayList;

public class Vaga {
    Veiculo veiculoVaga;
    Ticket ticketAtual;
    ArrayList<Ticket> vagaTickets = new ArrayList<Ticket>();

    public void ocupaVaga( Veiculo veiculo) {
        this.veiculoVaga = veiculo;
        this.ticketAtual = new Ticket(veiculo.getPlaca());
        vagaTickets.add(ticketAtual);
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

    public Ticket getTicketAtual() {
        return this.ticketAtual;
    }

    public Veiculo getVeiculoVaga() {
        return this.veiculoVaga;
    }

    public void getVagaTickets() {
        if (this.vagaTickets.size()>0) {
            for (int i = 0; i < this.vagaTickets.size(); i++) {
                Ticket obj = this.vagaTickets.get(i);

                System.out.println(obj.getTicketID());
            }
        } else {
            System.out.println("Essa vaga não possui tickets.");
        }

    }

    public void resetaVaga() {
        this.veiculoVaga = null;
        this.ticketAtual = null;
    }

}
