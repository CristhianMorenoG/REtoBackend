package com.cristhian.moreno.retobackend.models;


import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String id;
    private String horaSalida;
    private List<Destino> destinos;
    private List<Pasajero> pasajeros;
    private List<Bus> buses;

    public Viaje(String id, String horaSalida) {
        this.id = id;
        this.horaSalida = horaSalida;
        this.destinos = new ArrayList<>();
        this.pasajeros = new ArrayList<>();
        this.buses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String gethoraSalida() {
        return horaSalida;
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }



    @Override
    public String toString() {
        return "Viaje{" +
                "idViaje='" + id + '\'' +
                ", Hora de salida=" + horaSalida +
                ", Destino=" + destinos +
                ", Pasajeros=" + pasajeros +
                '}';
    }

}
