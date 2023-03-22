package com.example.grupo3_parcial.clases;

import java.util.ArrayList;

public class partido {

    private String nombre_rival;
    private int goles_anotados_rival;
    private String escudo_url;
    private int goles_anotados_principal;
    private String[] titulares;
    public partido(String nombre_rival, int goles_anotados_rival, String escudo_url, int goles_anotados_principal, String[] titulares){
        this.nombre_rival=nombre_rival;
        this.goles_anotados_rival=goles_anotados_rival;
        this.escudo_url=escudo_url;
        this.goles_anotados_principal=goles_anotados_principal;
        this.titulares = titulares;
    }

    public String[] getTitulares() {
        return titulares;
    }

    public void setTitulares(String[] titulares) {
        this.titulares = titulares;
    }

    public String getNombre_rival() {
        return nombre_rival;
    }

    public void setNombre_rival(String nombre_rival) {
        this.nombre_rival = nombre_rival;
    }

    public int getGoles_anotados_rival() {
        return goles_anotados_rival;
    }

    public void setGoles_anotados_rival(int goles_anotados_rival) {
        this.goles_anotados_rival = goles_anotados_rival;
    }

    public String getEscudo_url() {
        return escudo_url;
    }

    public void setEscudo_url(String escudo_url) {
        this.escudo_url = escudo_url;
    }

    public int getGoles_anotados_principal() {
        return goles_anotados_principal;
    }

    public void setGoles_anotados_principal(int goles_anotados_principal) {
        this.goles_anotados_principal = goles_anotados_principal;
    }

    }

