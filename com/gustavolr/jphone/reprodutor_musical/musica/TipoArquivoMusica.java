package com.gustavolr.jphone.reprodutor_musical.musica;

public enum TipoArquivoMusica {
    Internet("internet"),
    Arquivo("arquivo");

    public String tipo;
    TipoArquivoMusica(String tipo) {
        this.tipo = tipo;
    }
}
