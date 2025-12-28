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

import com.example.pedidos.models.Deposito;
import com.example.pedidos.services.DepositoService;

@RestController
@RequestMapping("/depositos")
public class DepositoController {
    
    @Autowired
    private DepositoService depositoService;

    @GetMapping
    public List<Deposito> listarTodos(){
        return depositoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Deposito listarPorId(@PathVariable Long id){
        return depositoService.listarPorId(id);
    }

    @PostMapping
    public Deposito crear(@RequestBody Deposito deposito){
        return depositoService.crear(deposito);
    }

    @PutMapping("/{id}")
    public Deposito actualizar(@PathVariable Long id,@RequestBody Deposito deposito){
        return depositoService.actualizar(id, deposito);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        depositoService.eliminar(id);
    }
}
