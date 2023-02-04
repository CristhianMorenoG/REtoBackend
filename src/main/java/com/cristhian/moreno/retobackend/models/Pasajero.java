package com.cristhian.moreno.retobackend.models;

import java.util.Objects;

public class Pasajero {
    private int idPasajero;
    private String nombre;

    public Pasajero(int id, String nombre) {
        this.idPasajero = id;
        this.nombre = nombre;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Pasajero{" +
                "Numero identificacion='" + idPasajero + '\'' +
                ", Nombre=" + nombre +
                '}';
    }

}

