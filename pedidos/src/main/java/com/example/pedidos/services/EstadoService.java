package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedidos.models.Estado;
import com.example.pedidos.repositories.EstadoRepository;

@Service
public class EstadoService {
    
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> listarTodos(){
        return estadoRepository.findAll();  
    }

    public Estado listarPorId(Long id){
        return estadoRepository.findById(id).orElse(null);
    }

    public Estado crear (Estado estado){
        return estadoRepository.save(estado);
    }

    public Estado actualizar(Long id, Estado estado){
        estado.setId(id);
        return estadoRepository.save(estado);
    }

    public void eliminar(Long id){
        estadoRepository.deleteById(id);
    }
}
