package com.cristhian.moreno.retobackend.service;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.models.Destino;
import com.cristhian.moreno.retobackend.models.Pasajero;
import com.cristhian.moreno.retobackend.models.Viaje;
import com.cristhian.moreno.retobackend.repository.TerminalTransportes;
import com.cristhian.moreno.retobackend.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ViajeService implements IViajeService {

    @Autowired
    private TerminalTransportes terminalTransportes;

    @Autowired
    private ViajeRepository viajeRepository;

    @Override
    public void agregarViaje(List<Bus> salidaBus) {
        Viaje nuevoViaje = new Viaje(UUID.randomUUID().toString(), new Date().toString());
        nuevoViaje.setBuses(salidaBus);
        viajeRepository.agregarViaje(nuevoViaje);

    }




    @Override
    public List<Viaje> validarViajes() {
        return viajeRepository.validarViajes();
    }


}
