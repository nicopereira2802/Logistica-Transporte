package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedidos.models.Cliente;
import com.example.pedidos.repositories.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();  
    }

    public Cliente listarPorId(Long id){
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente crear (Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente actualizar(Long id, Cliente cliente){
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    public void eliminar(Long id){
        clienteRepository.deleteById(id);
    }

    
}
