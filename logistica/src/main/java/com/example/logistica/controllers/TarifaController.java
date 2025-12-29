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

import com.example.logistica.models.Tarifa;
import com.example.logistica.services.TarifaService;

@RestController
@RequestMapping("/tarifas")
public class TarifaController {
    

    @Autowired
    private TarifaService tarifaService;

    @GetMapping
    public List<Tarifa> listarTodos(){
        return tarifaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Tarifa listarPorId(@PathVariable Long id){
        return tarifaService.listarPorId(id);
    }

    @PostMapping
    public Tarifa crear(@RequestBody Tarifa tarifa){
        return tarifaService.crear(tarifa);
    }

    @PutMapping("/{id}")
    public Tarifa actualizar(@PathVariable Long id,@RequestBody Tarifa tarifa){
        return tarifaService.actualizar(id, tarifa);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        tarifaService.eliminar(id);
    }


}
