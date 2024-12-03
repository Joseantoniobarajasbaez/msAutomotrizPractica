package com.tecnm.automotriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnm.automotriz.entity.Modelo;

public interface ModelosRepository extends JpaRepository<Modelo, Integer>{
    

}
