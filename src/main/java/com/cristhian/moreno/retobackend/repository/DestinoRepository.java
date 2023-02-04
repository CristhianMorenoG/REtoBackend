package com.cristhian.moreno.retobackend.repository;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.models.Destino;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DestinoRepository {

    private int id;
    private String name;

    private List<Destino> destinos;

    public List<Destino> obtenerDestinos(){
        return this.destinos;
    }
}