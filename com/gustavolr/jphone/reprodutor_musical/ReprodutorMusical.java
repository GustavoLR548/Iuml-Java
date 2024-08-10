package com.gustavolr.jphone.reprodutor_musical;

import java.util.ArrayList;

import com.gustavolr.jphone.reprodutor_musical.musica.Musica;

public class ReprodutorMusical {

    private Musica musica;
    private ArrayList<Musica> musicas;
    private boolean pausado;

    public ReprodutorMusical(Musica musica, ArrayList<Musica> musicas, boolean pausado) {
        this.musica = musica;
        this.musicas = musicas;
        this.pausado = pausado;
    }

    public Musica getMusica() {
        return musica;
    }
    public void setMusica(Musica musica) {
        this.musica = musica;
    }
    public ArrayList<Musica> getMusicas() {
        return musicas;
    }
    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
    public boolean isPausado() {
        return pausado;
    }
    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }

    public boolean tocarMusica(Musica musicaATocar) {
        return false;
    }

    public boolean pausarMusica() {
        return true;
    }

    public boolean selecionarMusica(int musicaIndex) {
        return true;
    }
    
}
