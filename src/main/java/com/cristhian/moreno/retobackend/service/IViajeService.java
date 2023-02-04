package com.cristhian.moreno.retobackend.service;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.models.Destino;
import com.cristhian.moreno.retobackend.models.TiqueteViaje;
import com.cristhian.moreno.retobackend.models.Viaje;

import java.util.List;

public interface IViajeService {

    void agregarViaje(List<Bus> registroViaje);

    List<Viaje> validarViajes();

}