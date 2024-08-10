package com.gustavolr.jphone.reprodutor_musical.musica;
import java.util.Date;

public class MusicaInternet extends Musica {

    public MusicaInternet(String nome, String artista, String album, Date lancamento) {
        super(nome, artista, album, TipoArquivoMusica.Internet, lancamento);
    }
    
    public byte[] getStreamDados() {
        return null;
    }    
}
