package com.cristhian.moreno.retobackend.controller;

import com.cristhian.moreno.retobackend.models.Bus;
import com.cristhian.moreno.retobackend.models.Destino;
import com.cristhian.moreno.retobackend.service.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DestinoController {
    @Autowired
    private IDestinoService destinoService;


    private List<Destino> destinos = new ArrayList<>();

    @GetMapping("/GETdestino")
    public ResponseEntity GetBuses() {

        return new ResponseEntity(destinoService.validarDestinos(), HttpStatus.FOUND);
    }
    @PostMapping("/ADDdestino")
    public ResponseEntity addBus(@RequestBody Destino destino) {
        return new ResponseEntity(destinoService.agregarDestino(destino), HttpStatus.CREATED);
    }
}
