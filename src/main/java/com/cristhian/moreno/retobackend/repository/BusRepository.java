package com.cristhian.moreno.retobackend.repository;

import com.cristhian.moreno.retobackend.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BusRepository {

    private List<Bus> ocupacionBus;

    public BusRepository() {
        this.ocupacionBus = new ArrayList<>();
    }

    public List<Bus> validarBuses(){
        return this.ocupacionBus;
    }

    public void sumarPasajero(Bus busOcupado){
        ocupacionBus.add(busOcupado);
    }




}
