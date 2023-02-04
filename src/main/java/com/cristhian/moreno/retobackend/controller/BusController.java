package com.cristhian.moreno.retobackend.controller;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.service.BusService;
import com.cristhian.moreno.retobackend.service.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1")

public class BusController {
    @Autowired
    private IBusService busService;

    @GetMapping("/GETbuses")
    public ResponseEntity GetBuses() {

        return new ResponseEntity(busService.obtenerBuses(), HttpStatus.FOUND);
    }
    @PostMapping("/ADDbus")
    public ResponseEntity agregarBus(@RequestBody Bus bus) {
        return new ResponseEntity(busService.agregarBus(bus), HttpStatus.CREATED);
    }
}
