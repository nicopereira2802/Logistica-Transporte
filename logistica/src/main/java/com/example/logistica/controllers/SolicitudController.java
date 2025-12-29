package com.example.logistica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.logistica.models.Solicitud;
import com.example.logistica.services.SolicitudService;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {
    
    @Autowired
    private SolicitudService solicitudService;

    @GetMapping
    public List<Solicitud> listarTodos(){
        return solicitudService.listarTodos();
    }

    @GetMapping("/{id}")
    public Solicitud listarPorId(@PathVariable Long id){
        return solicitudService.listarPorId(id);
    }

    @PostMapping
    public Solicitud crear(@RequestBody Solicitud solicitud){
        return solicitudService.crear(solicitud);
    }

    @PutMapping("/{id}")
    public Solicitud actualizar(@PathVariable Long id,@RequestBody Solicitud solicitud){
        return solicitudService.actualizar(id, solicitud);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        solicitudService.eliminar(id);
    }

}
