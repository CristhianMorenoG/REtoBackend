package com.cristhian.moreno.retobackend.controller;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.service.IPasajeroService;
import com.cristhian.moreno.retobackend.service.IViajeService;
import com.cristhian.moreno.retobackend.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ViajeController {
    @Autowired
    private IViajeService viajeService;
    @Autowired
    private IPasajeroService iPasajeroService;

    @GetMapping("/GETviaje")
    public ResponseEntity GETviajes(){

        return new ResponseEntity(viajeService.validarViajes() , HttpStatus.FOUND);
    }
    @PostMapping("/ADDviaje")
    public ResponseEntity agregarViaje(@RequestBody List<Bus> buses) {
        viajeService.agregarViaje(buses);
        return new ResponseEntity(HttpStatus.CREATED);
    }

}

