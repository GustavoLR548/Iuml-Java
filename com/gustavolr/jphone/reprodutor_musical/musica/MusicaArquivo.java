package com.gustavolr.jphone.reprodutor_musical.musica;
import java.util.Date;

public class MusicaArquivo extends Musica {

    public MusicaArquivo(String nome, String artista, String album, Date lancamento) {
        super(nome, artista, album, TipoArquivoMusica.Arquivo, lancamento);
    }
    
    public byte[] getStreamDados() {
        return null;
    }    
}
