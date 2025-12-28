package com.example.logistica.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TramoRuta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "orden")
    private Long orden;

    @Column(name = "tipoTramo")
    private String tipoTramo;

    @Column(name = "fechaEstimadaSalida")
    private LocalDate fechaEstimadaSalida;

    @Column(name = "fechaEstimadaLlegada")
    private LocalDate fechaEstimadaLlegada;

    @Column(name = "fechaRealSalida")
    private LocalDate fechaRealSalida;

    @Column(name = "fechaRealLlegada")
    private LocalDate fechaRealLlegada;

    @ManyToOne
    @JoinColumn(name = "solicitud_Id")
    private Solicitud solicitud;

    @Column(name = "ciudad_Origen_Id")
    private Long ciudadOrigenId;

    @Column(name = "ciudad_Destino_Id")
    private Long ciudadDestinoId;
}
