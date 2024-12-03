package com.tecnm.automotriz.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity(name="auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auto_id")
    private int id;

    @Column(unique=true)
    private String no_serie;

    @ManyToOne
    private Fabricante fabricante;

    @ManyToOne
    private Modelo modelo;

    

}
