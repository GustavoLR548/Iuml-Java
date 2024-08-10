package com.gustavolr.jphone.navegador_internet.pagina;

import java.util.ArrayList;
import java.util.Date;

import javax.imageio.ImageIO;

public class PaginaHistorico {
    
    private String url;
    private String titulo;
    private Date dataHoraAcesso;
    private long tempoPermanencia;
    private ImageIO miniatura;
    private ArrayList<String> tags;

    
    public PaginaHistorico(String url, 
                           String titulo, 
                           Date dataHoraAcesso, 
                           long tempoPermanencia, 
                           ImageIO miniatura,
                           ArrayList<String> tags) {
        this.url = url;
        this.titulo = titulo;
        this.dataHoraAcesso = dataHoraAcesso;
        this.tempoPermanencia = tempoPermanencia;
        this.miniatura = miniatura;
        this.tags = tags;
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
    public Date getDataHoraAcesso() {
        return dataHoraAcesso;
    }
    public void setDataHoraAcesso(Date dataHoraAcesso) {
        this.dataHoraAcesso = dataHoraAcesso;
    }
    public long getTempoPermanencia() {
        return tempoPermanencia;
    }
    public void setTempoPermanencia(long tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }
    public ImageIO getMiniatura() {
        return miniatura;
    }
    public void setMiniatura(ImageIO miniatura) {
        this.miniatura = miniatura;
    }
    public ArrayList<String> getTags() {
        return tags;
    }
    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    
}
