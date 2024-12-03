package com.tecnm.automotriz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="fabricante")
public class Fabricante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fabricante_id")
    private int id;
        
    @Column
    private String nombre;
    

}
