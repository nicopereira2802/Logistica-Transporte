package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pedidos.models.Estado;

public interface EstadoRepository extends JpaRepository <Estado,Long>{
    
}
