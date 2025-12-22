package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pedidos.models.Deposito;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito,Long> {
    
}
