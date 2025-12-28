package com.example.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.logistica.models.Solicitud;

@Repository
public interface TarifaRepository extends JpaRepository<Long, Solicitud>{
    
}
