package com.tecnm.automotriz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnm.automotriz.entity.Fabricante;
import com.tecnm.automotriz.repository.FabricantesRepository;

@Service
public class FabricantesService {

    @Autowired
    FabricantesRepository fabricantesRepository;
    
    public List<Fabricante> findAll(){
        return fabricantesRepository.findAll();
    }

    /**
     * @param id_fabricante
     * @return
     */
    public Optional<Fabricante> findById(int id_fabricante){
        return fabricantesRepository.findById(id_fabricante);
    }
    
    public Fabricante save(Fabricante fabr){
        return fabricantesRepository.save(fabr);
    }
}
