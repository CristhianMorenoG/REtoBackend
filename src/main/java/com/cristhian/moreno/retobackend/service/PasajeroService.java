package com.cristhian.moreno.retobackend.service;

import com.cristhian.moreno.retobackend.models.Pasajero;
import com.cristhian.moreno.retobackend.models.TiqueteViaje;
import com.cristhian.moreno.retobackend.repository.TerminalTransportes;
import com.cristhian.moreno.retobackend.repository.TiqueteViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PasajeroService implements IPasajeroService {

    @Autowired
    TerminalTransportes terminalTransportes;
    @Autowired
    private TiqueteViajeRepository tiqueteViajeRepository;
    @Autowired
    private TiqueteViaje tiqueteviaje;

    @Override
    public List<Pasajero> obtenerListaPasajeros() {
        return terminalTransportes.validarPasajeros();
    }


    @Override
    public Pasajero nuevoPasajero(Pasajero pasajero) {
        Pasajero newPasajero = new Pasajero(pasajero.getIdPasajero(),
                pasajero.getNombre());
        terminalTransportes.agregarPasajero(newPasajero);
        return newPasajero;
    }

    @Override
    public void agregarPasajerosViaje(List<Pasajero> registroPasajero) {
        TiqueteViaje addPasajero = new TiqueteViaje(UUID.randomUUID().toString(), new Date().toString());
        addPasajero.setCapacidadBus(registroPasajero);
        registroPasajero.stream().forEach(capacidad -> {
            


    }
    @Override
    public List<TiqueteViaje> salidaPasajeros() {
        return tiqueteViajeRepository.validarTiquete();
    }
}
