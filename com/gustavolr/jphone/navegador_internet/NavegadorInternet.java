package com.gustavolr.jphone.navegador_internet;

import java.net.URL;
import java.util.ArrayList;

import com.gustavolr.jphone.navegador_internet.pagina.Pagina;
import com.gustavolr.jphone.navegador_internet.pagina.PaginaHistorico;
import com.gustavolr.jphone.navegador_internet.pagina.PastaDePaginasFavoritas;

public class NavegadorInternet {
    
    private Pagina paginaAtual;
    private ArrayList<Pagina> paginasAbertas;
    private ArrayList<PastaDePaginasFavoritas> favoritos;
    private ArrayList<PaginaHistorico> historico;
    
    public NavegadorInternet(Pagina paginaAtual, ArrayList<Pagina> paginasAbertas,
            ArrayList<PastaDePaginasFavoritas> favoritos, ArrayList<PaginaHistorico> historico) {
        this.paginaAtual = paginaAtual;
        this.paginasAbertas = paginasAbertas;
        this.favoritos = favoritos;
        this.historico = historico;
    }

    public Pagina getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(Pagina paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public ArrayList<Pagina> getPaginasAbertas() {
        return paginasAbertas;
    }
    public void setPaginasAbertas(ArrayList<Pagina> paginasAbertas) {
        this.paginasAbertas = paginasAbertas;
    }
    public ArrayList<PastaDePaginasFavoritas> getFavoritos() {
        return favoritos;
    }
    public void setFavoritos(ArrayList<PastaDePaginasFavoritas> favoritos) {
        this.favoritos = favoritos;
    }
    public ArrayList<PaginaHistorico> getHistorico() {
        return historico;
    }
    public void setHistorico(ArrayList<PaginaHistorico> historico) {
        this.historico = historico;
    }

    public void exibirPagina(Pagina pagina) {

    }

    public void adicionarNovaAba(String url) {

    }

    public void adicionarNovaAba(URL url) {

    }

    public void atualizarPaginaAtual() {

    }

    public void abrirHistorico() {

    }

    public void abrirPastaFavoritos(PastaDePaginasFavoritas pasta) {

    }
}
