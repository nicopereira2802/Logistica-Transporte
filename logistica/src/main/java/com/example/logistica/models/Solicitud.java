package com.example.logistica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @Column(name = "contenedor_id")
    private Long contenedor_id;

    @Column(name = "ciudadOrigenId")
    private Long ciudadOrigenId;

    @Column(name = "ciudadDestinoId")
    private Long ciudadDestinoId;

    @Column(name = "depositoId")
    private Long depositoId;

    @Column(name = "camionId")
    private Long camionId;

    @Column(name = "costoEstimado")
    private Double costoEstimado;

    @Column(name = "tiempoEstimadoHoras")
    private Double tiempoEstimadoHoras;
}
