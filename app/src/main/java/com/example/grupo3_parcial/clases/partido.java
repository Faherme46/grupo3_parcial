package com.example.grupo3_parcial.clases;

public class partido {
    private String nombre_rival;
    private Double goles_anotados_rival;
    private String escudo_url;
    private Double goles_anotados_principal;
    private String jugadores;

    public String getNombre_rival() {
        return nombre_rival;
    }

    public void setNombre_rival(String nombre_rival) {
        this.nombre_rival = nombre_rival;
    }

    public Double getGoles_anotados_rival() {
        return goles_anotados_rival;
    }

    public void setGoles_anotados_rival(Double goles_anotados_rival) {
        this.goles_anotados_rival = goles_anotados_rival;
    }

    public String getEscudo_url() {
        return escudo_url;
    }

    public void setEscudo_url(String escudo_url) {
        this.escudo_url = escudo_url;
    }

    public Double getGoles_anotados_principal() {
        return goles_anotados_principal;
    }

    public void setGoles_anotados_principal(Double goles_anotados_principal) {
        this.goles_anotados_principal = goles_anotados_principal;
    }

    public String getJugadores() {
        return jugadores;
    }

    public void setJugadores(String jugadores) {
        this.jugadores = jugadores;
    }
}
