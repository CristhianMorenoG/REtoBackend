package com.cristhian.moreno.retobackend.controller;

import com.cristhian.moreno.retobackend.models.Pasajero;
import com.cristhian.moreno.retobackend.service.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1")
public class PasajeroController {

    @Autowired
    private IPasajeroService pasajeroService;

    @GetMapping("/GETPasajero")
    public ResponseEntity verPasajeros(){
        return new ResponseEntity(pasajeroService.obtenerListaPasajeros(), HttpStatus.FOUND);
    }

    @PostMapping("/ADDpasajero")
    public ResponseEntity nuevoPasajero(@RequestBody Pasajero pasajeros) {
        return new ResponseEntity(pasajeroService.nuevoPasajero(pasajeros), HttpStatus.CREATED);
    }
    @PostMapping("/ADDPasajeroABus")
    public ResponseEntity registrarPasajero(@RequestBody List<Pasajero> pasajeros){
        pasajeroService.agregarPasajerosViaje(pasajeros);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


}
