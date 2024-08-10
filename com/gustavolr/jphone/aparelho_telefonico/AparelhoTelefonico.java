package com.gustavolr.jphone.aparelho_telefonico;

import java.util.ArrayList;

public class AparelhoTelefonico {
    private ArrayList<Contato> agenda;
    private ArrayList<Chamada> historicoChamadas;
    private Thread chamadaListener;
    
    public AparelhoTelefonico(ArrayList<Contato> agenda, ArrayList<Chamada> historicoChamadas) {
        this.agenda = agenda;
        this.historicoChamadas = historicoChamadas;
    }

    public ArrayList<Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contato> agenda) {
        this.agenda = agenda;
    }

    public ArrayList<Chamada> getHistoricoChamadas() {
        return historicoChamadas;
    }

    public void setHistoricoChamadas(ArrayList<Chamada> historicoChamadas) {
        this.historicoChamadas = historicoChamadas;
    }
    
}
