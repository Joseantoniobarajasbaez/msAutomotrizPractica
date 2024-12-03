package com.tecnm.automotriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnm.automotriz.entity.Auto;

public interface AutosRepository extends JpaRepository<Auto, Integer>{
    

}
