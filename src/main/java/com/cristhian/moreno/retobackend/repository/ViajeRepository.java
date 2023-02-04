package com.cristhian.moreno.retobackend.repository;

import com.cristhian.moreno.retobackend.models.Viaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ViajeRepository {

    private List<Viaje> viajes;

    public ViajeRepository(){
        this.viajes = new ArrayList<>();
    }

    public List<Viaje> validarViajes(){return  this.viajes;}

    public void agregarViaje(Viaje viaje){viajes.add(viaje);}


}
