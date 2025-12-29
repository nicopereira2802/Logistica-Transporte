package com.example.logistica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.logistica.models.TramoRuta;
import com.example.logistica.repositories.TramoRutaRepository;

@Service
public class TramoRutaService {
    
    @Autowired
    private TramoRutaRepository tramoRutaRepository;

    public List<TramoRuta> listarTodos(){
        return tramoRutaRepository.findAll();  
    }

    public TramoRuta listarPorId(Long id){
        return tramoRutaRepository.findById(id).orElse(null);
    }

    public TramoRuta crear (TramoRuta tramoRuta){
        return tramoRutaRepository.save(tramoRuta);
    }

    public TramoRuta actualizar(Long id, TramoRuta tramoRuta){
        tramoRuta.setId(id);
        return tramoRutaRepository.save(tramoRuta);
    }

    public void eliminar(Long id){
        tramoRutaRepository.deleteById(id);
    }
}
