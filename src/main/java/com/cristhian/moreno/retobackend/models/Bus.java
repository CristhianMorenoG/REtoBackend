package com.cristhian.moreno.retobackend.models;

import java.util.List;

public class Bus {
    private String id;
    private String nombreEmpresa;
    private String placaBus;
    private int capacidad;
    private List<Pasajero> pasajeros;


    public Bus(String id, String nombreEmpresa, String placaBus, int capacidad) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.placaBus = placaBus;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getPlacaBus() {
        return placaBus;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void disminuirCapacidad() {
        this.capacidad--;
    }


    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void SetBuses(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }



    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                ", Nombre Empresa=" + nombreEmpresa +
                ", Placas=" + placaBus +
                ", Capacidad Pasajeros=" + capacidad +
                '}';
    }
}
