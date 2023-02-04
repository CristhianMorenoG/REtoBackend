package com.cristhian.moreno.retobackend.repository;

import com.cristhian.moreno.retobackend.models.TiqueteViaje;

import java.util.ArrayList;
import java.util.List;

public class TiqueteViajeRepository {
    private List<TiqueteViaje> tiquete;

    public TiqueteViajeRepository(){
        this.tiquete = new ArrayList<>();

    }

    public List<TiqueteViaje> validarTiquete(){
        return this.tiquete;
    }

    public void agregarTiquete(TiqueteViaje tiqueteViaje){
        tiquete.add(tiqueteViaje);
    }

}
