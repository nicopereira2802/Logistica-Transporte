package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pedidos.models.Ciudad;
import com.example.pedidos.repositories.CiudadRepository;

@Service
public class CiudadService {
    
    @Autowired
    private CiudadRepository ciudadRepository;


    public List<Ciudad> listarTodos(){
        return ciudadRepository.findAll();  
    }

    public Ciudad listarPorId(Long id){
        return ciudadRepository.findById(id).orElse(null);
    }

    public Ciudad crear (Ciudad ciudad){
        return ciudadRepository.save(ciudad);
    }

    public Ciudad actualizar(Long id, Ciudad ciudad){
        ciudad.setId(id);
        return ciudadRepository.save(ciudad);
    }

    public void eliminar(Long id){
        ciudadRepository.deleteById(id);
    }


}
