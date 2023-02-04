package com.cristhian.moreno.retobackend.models;

import java.util.List;

public class Destino {
    private int id;
    private String nombre;

    private List<Destino> destinos;

    public Destino(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Destino> getDestino() {
        return destinos;
    }

    public void setDestino(List<Destino> destinos) {
        this.destinos = destinos;
    }

}
