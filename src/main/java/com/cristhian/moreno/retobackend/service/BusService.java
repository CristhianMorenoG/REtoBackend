package com.cristhian.moreno.retobackend.service;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.repository.BusRepository;
import com.cristhian.moreno.retobackend.repository.TerminalTransportes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService implements IBusService{
    @Autowired
    private TerminalTransportes terminalTransportes;
    @Autowired
    private BusRepository busRepository;



    @Override
    public List<Bus> obtenerBuses() {
        return terminalTransportes.validarBuses();
    }

    @Override
    public Bus agregarBus(Bus bus) {
        Bus nuevoBus = new Bus(bus.getId(),
                bus.getNombreEmpresa(),
                bus.getPlacaBus(),
                bus.getCapacidad());
        terminalTransportes.agregarBus(nuevoBus);
        return nuevoBus;


    }

    }

