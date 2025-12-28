package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedidos.models.Contenedor;
import com.example.pedidos.repositories.ContenedorRepository;

@Service
public class ContenedorService {

    @Autowired
    private ContenedorRepository contenedorRepository;

    public List<Contenedor> listarTodos(){
        return contenedorRepository.findAll();  
    }

    public Contenedor listarPorId(Long id){
        return contenedorRepository.findById(id).orElse(null);
    }

    public Contenedor crear (Contenedor contenedor){
        return contenedorRepository.save(contenedor);
    }

    public Contenedor actualizar(Long id, Contenedor contenedor){
        contenedor.setId(id);
        return contenedorRepository.save(contenedor);
    }

    public void eliminar(Long id){
        contenedorRepository.deleteById(id);
    }
}
