package com.gustavolr.jphone.aparelho_telefonico;

import java.time.Duration;

public class Chamada {
    private Contato contato;
    private Duration duracao;
    private String localizacao;
    
    public Chamada(Contato contato, Duration duracao, String localizacao) {
        this.contato = contato;
        this.duracao = duracao;
        this.localizacao = localizacao;
    }

    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public Duration getDuracao() {
        return duracao;
    }
    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void ligarNovamente() {

    }

    public String exibirDetalhes() {
        return "";
    }
}
