package com.example.pedidos.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Camion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "capacidad_peso")
    private double capacidad_peso;

    @Column(name = "capacidad_volumen")
    private double capacidad_volumen;

    @Column(name = "disponible")
    private boolean disponible;
    
}
