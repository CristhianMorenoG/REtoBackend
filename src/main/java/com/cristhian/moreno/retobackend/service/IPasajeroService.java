package com.cristhian.moreno.retobackend.service;

import com.cristhian.moreno.retobackend.models.Pasajero;
import com.cristhian.moreno.retobackend.models.TiqueteViaje;

import java.util.List;

public interface IPasajeroService {

    List<Pasajero> obtenerListaPasajeros();
    Pasajero nuevoPasajero(Pasajero pasajero);

    void agregarPasajerosViaje(List<Pasajero> registroPasajero);
    List<TiqueteViaje> salidaPasajeros();


}
