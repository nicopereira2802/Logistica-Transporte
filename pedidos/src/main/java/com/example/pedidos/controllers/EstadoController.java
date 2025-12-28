package com.example.pedidos.controllers;

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

import com.example.pedidos.models.Estado;
import com.example.pedidos.services.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estado> listarTodos(){
        return estadoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Estado listarPorId(@PathVariable Long id){
        return estadoService.listarPorId(id);
    }

    @PostMapping
    public Estado crear(@RequestBody Estado estado){
        return estadoService.crear(estado);
    }

    @PutMapping("/{id}")
    public Estado actualizar(@PathVariable Long id,@RequestBody Estado estado){
        return estadoService.actualizar(id, estado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        estadoService.eliminar(id);
    }

}
