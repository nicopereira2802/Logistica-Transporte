package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pedidos.models.Camion;
import com.example.pedidos.repositories.CamionRepository;

@Service
public class CamionService {
    
    @Autowired
    private CamionRepository camionRepository; 


    public List<Camion> listarTodos(){
        return camionRepository.findAll();  
    }

    public Camion listarPorId(Long id){
        return camionRepository.findById(id).orElse(null);
    }

    public Camion crear (Camion camion){
        return camionRepository.save(camion);
    }

    public Camion actualizar(Long id, Camion camion){
        camion.setId(id);
        return camionRepository.save(camion);
    }

    public void eliminar(Long id){
        camionRepository.deleteById(id);
    }
}
