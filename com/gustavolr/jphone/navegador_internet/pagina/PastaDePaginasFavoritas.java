package com.gustavolr.jphone.navegador_internet.pagina;

import java.util.ArrayList;

public class PastaDePaginasFavoritas {
    public String nome;
    public ArrayList<PaginaFavorita> paginas;
    
    public PastaDePaginasFavoritas(String nome, ArrayList<PaginaFavorita> paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<PaginaFavorita> getPaginas() {
        return paginas;
    }
    public void setPaginas(ArrayList<PaginaFavorita> paginas) {
        this.paginas = paginas;
    }

    public void adicionarPagina(PaginaFavorita pagina) {
        paginas.add(pagina);
    }

    public void removerPagina(PaginaFavorita pagina) {
        paginas.remove(pagina);
    }

    public String listarPaginas() {
        return "";
    }
}
