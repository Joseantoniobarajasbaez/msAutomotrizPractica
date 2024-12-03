package com.tecnm.automotriz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnm.automotriz.entity.Modelo;
import com.tecnm.automotriz.repository.ModelosRepository;

@Service
public class ModelosService {

    @Autowired
    ModelosRepository modelosRepository;
    
    public List<Modelo> findAll(){
        return modelosRepository.findAll();
    }

    /**
     * @param id_modelo
     * @return
     */
    public Optional<Modelo> findById(int id_modelo){
        return modelosRepository.findById(id_modelo);
    }
    
    public Modelo save(Modelo m){
        return modelosRepository.save(m);
    }
}
