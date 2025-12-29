package com.example.logistica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.logistica.models.Solicitud;
import com.example.logistica.repositories.SolicitudRepository;

@Service
public class SolicitudService {
   
    @Autowired
    private SolicitudRepository solicitudRepository;

    public List<Solicitud> listarTodos(){
        return solicitudRepository.findAll();  
    }

    public Solicitud listarPorId(Long id){
        return solicitudRepository.findById(id).orElse(null);
    }

    public Solicitud crear (Solicitud solicitud){
        return solicitudRepository.save(solicitud);
    }

    public Solicitud actualizar(Long id, Solicitud solicitud){
        solicitud.setId(id);
        return solicitudRepository.save(solicitud);
    }

    public void eliminar(Long id){
        solicitudRepository.deleteById(id);
    }


}
