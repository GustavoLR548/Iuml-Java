package com.gustavolr.jphone.aparelho_telefonico;

import javax.imageio.ImageIO;

public class Contato {
    
    private String numero;
    private int ddd;
    private String nome;
    private String descricao;
    private ImageIO icone;
    
    public Contato(String numero, int ddd, String nome, String descricao, ImageIO icone) {
        this.numero = numero;
        this.ddd = ddd;
        this.nome = nome;
        this.descricao = descricao;
        this.icone = icone;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getDdd() {
        return ddd;
    }
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ImageIO getIcone() {
        return icone;
    }

    public void setIcone(ImageIO icone) {
        this.icone = icone;
    }

    public String exibirDetalhes() {
        return "";
    }

    public long calcularTempoPermanencia() {
        return 0;
    }

    public void gerarMiniatura() {
    }

    public boolean associarTag(String tag) {
        return false;
    }

    public boolean removerTag(String tag) {
        return false;
    }
}
