package com.example.logistica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.logistica.models.Tarifa;
import com.example.logistica.repositories.TarifaRepository;

@Service
public class TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;

    public List<Tarifa> listarTodos(){
        return tarifaRepository.findAll();  
    }

    public Tarifa listarPorId(Long id){
        return tarifaRepository.findById(id).orElse(null);
    }

    public Tarifa crear (Tarifa tarifa){
        return tarifaRepository.save(tarifa);
    }

    public Tarifa actualizar(Long id, Tarifa tarifa){
        tarifa.setId(id);
        return tarifaRepository.save(tarifa);
    }

    public void eliminar(Long id){
        tarifaRepository.deleteById(id);
    }
}
