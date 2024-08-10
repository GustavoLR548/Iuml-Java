package com.gustavolr.jphone.reprodutor_musical.musica;

import java.util.Date;

public abstract class Musica {
    protected String nome;
    protected String artista;
    protected String album;
    protected TipoArquivoMusica tipo;
    protected Date lancamento;

    public Musica(String nome, 
                  String artista, 
                  String album, 
                  TipoArquivoMusica tipo, 
                  Date lancamento) {
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.tipo = tipo;
        this.lancamento = lancamento;
    }

    public byte[] getStreamDados() {
        return null;
    }
}
