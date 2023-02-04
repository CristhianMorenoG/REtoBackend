package com.cristhian.moreno.retobackend.service;

import com.cristhian.moreno.retobackend.models.Bus;

import java.util.List;

public interface IBusService {
    List<Bus> obtenerBuses();
    Bus agregarBus(Bus bus);
}
