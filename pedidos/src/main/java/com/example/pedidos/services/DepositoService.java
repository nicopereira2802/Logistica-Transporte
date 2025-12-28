package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedidos.models.Deposito;
import com.example.pedidos.repositories.DepositoRepository;

@Service
public class DepositoService {

    @Autowired
    private DepositoRepository depositoRepository;


    public List<Deposito> listarTodos(){
        return depositoRepository.findAll();  
    }

    public Deposito listarPorId(Long id){
        return depositoRepository.findById(id).orElse(null);
    }

    public Deposito crear (Deposito deposito){
        return depositoRepository.save(deposito);
    }

    public Deposito actualizar(Long id, Deposito deposito){
        deposito.setId(id);
        return depositoRepository.save(deposito);
    }

    public void eliminar(Long id){
        depositoRepository.deleteById(id);
    }
    
}
