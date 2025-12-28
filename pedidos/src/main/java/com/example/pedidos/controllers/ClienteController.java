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

import com.example.pedidos.models.Cliente;
import com.example.pedidos.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarTodos(){
        return clienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Cliente listarPorId(@PathVariable Long id){
        return clienteService.listarPorId(id);
    }

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente){
        return clienteService.crear(cliente);
    }

    @PutMapping("/{id}")
    public Cliente actualizar(@PathVariable Long id,@RequestBody Cliente cliente){
        return clienteService.actualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        clienteService.eliminar(id);
    }
}
