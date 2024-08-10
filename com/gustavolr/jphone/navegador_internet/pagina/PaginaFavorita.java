package com.gustavolr.jphone.navegador_internet.pagina;

public class PaginaFavorita {
    private String url;
    private String titulo;

    public PaginaFavorita(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void abrirPagina() {

    }

    public String exibirDetalhes() {
        return "";
    }
}
