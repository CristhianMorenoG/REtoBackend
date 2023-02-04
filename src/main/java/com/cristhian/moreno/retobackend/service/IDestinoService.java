package com.cristhian.moreno.retobackend.service;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.models.Destino;

import java.util.List;

public interface IDestinoService {

    Destino agregarDestino(Destino destino);
    List<Destino> validarDestinos();

}
