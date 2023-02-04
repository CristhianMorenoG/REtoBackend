package com.cristhian.moreno.retobackend.service;

import com.cristhian.moreno.retobackend.models.Destino;
import com.cristhian.moreno.retobackend.repository.DestinoRepository;
import com.cristhian.moreno.retobackend.repository.TerminalTransportes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService implements IDestinoService{

    @Autowired
    TerminalTransportes terminalTransportes;

    @Autowired
    DestinoRepository destinoRepository;


    @Override
    public Destino agregarDestino(Destino destinos) {
        Destino nuevodestino = new Destino(destinos.getId(),
                destinos.getNombre());
        terminalTransportes.agregarDestino(nuevodestino);
        return destinos;
    }

    @Override
    public List<Destino> validarDestinos() {
        return terminalTransportes.validarDestinos();
    }


}
