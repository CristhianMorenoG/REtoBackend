package com.cristhian.moreno.retobackend.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TiqueteViaje {

    private String id;
    private String fecha;
    private List<Pasajero> capacidadBus;

    public TiqueteViaje(String id, String fecha) {
        this.id = id;
        this.fecha = fecha;
        this.capacidadBus = new ArrayList<>();;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Pasajero> getCapacidadBus() {

        return capacidadBus;
    }

    public void setCapacidadBus(List<Pasajero> capacidadBus) {

        this.capacidadBus = capacidadBus;
    }
}
