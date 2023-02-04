package com.cristhian.moreno.retobackend.repository;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.models.Destino;
import com.cristhian.moreno.retobackend.models.Pasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TerminalTransportes {
    private List<Destino> destinos;
    private List<Bus> buses;
    private List<Pasajero> pasajeros;


    public TerminalTransportes() {
        destinos = new ArrayList<>(List.of(new Destino(1, "Cali"),
                new Destino(2, "Santa Marta"),
                new Destino(3, "Barranquilla"),
                new Destino(4, "Cartagena")));
        buses = new ArrayList<>(List.of(new Bus("A5142", "Rapido Tolima", "FXD140", 30),
                new Bus("F521", "Expreso Bolivariano", "HJD851", 60),
                new Bus("N021", "Expreso Brasilia", "POT652", 40),
                new Bus("U001", "Copetran", "DCB430", 20)));
        pasajeros = new ArrayList<>(List.of(new Pasajero(1450684512, "Andres Perez"),
                new Pasajero(9521451, "Maria Lopez"),
                new Pasajero(1962841000, "Julian Martinez"),
                new Pasajero(651230140, "Nepomuceno Garcia")));
    }


    @Override
    public String toString() {
        return "Terminal de Transportes{" +
                ", buses=" + buses +
                ", destinos=" + destinos +
                '}';
    }

    public List<Destino> validarDestinos() {

        return destinos;
    }

    public void agregarDestino(Destino destino) {

        destinos.add(destino);
    }

    public List<Bus> validarBuses() {

        return buses;
    }

    public void agregarBus(Bus bus) {
        buses.add(bus);
    }

    public void disminuirSillasDisponibles(String id) {
        List<Bus> resultado = buses.stream().map(capacidad -> {
            if (capacidad.getId().equals(id)) {
                capacidad.disminuirCapacidad();
                return capacidad;
            }
            return capacidad;
        }).collect(Collectors.toList());
    }


    public List<Pasajero> validarPasajeros() {
        return pasajeros;
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

}

