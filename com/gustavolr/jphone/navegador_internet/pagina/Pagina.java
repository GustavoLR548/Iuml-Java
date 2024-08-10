package com.gustavolr.jphone.navegador_internet.pagina;

import javax.imageio.ImageIO;

public class Pagina {
    private String url;
    private boolean estaAberta;
    private ImageIO miniatura;

    public Pagina(String url, boolean estaAberta, ImageIO miniatura) {
        this.url = url;
        this.estaAberta = estaAberta;
        this.miniatura = miniatura;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public boolean isEstaAberta() {
        return estaAberta;
    }
    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }
    public ImageIO getMiniatura() {
        return miniatura;
    }
    public void setMiniatura(ImageIO miniatura) {
        this.miniatura = miniatura;
    }

    public String exibirDetalhesTooltip() {
        return "";
    }

    public long calcularUsoMedioDeMemoria() {
        return 0;
    }
}
