package com.tecnm.automotriz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnm.automotriz.entity.Auto;
import com.tecnm.automotriz.repository.AutosRepository;

@Service
public class AutosService {

    @Autowired
    AutosRepository autosRepository;
    
    public List<Auto> findAll(){
        return autosRepository.findAll();
    }

    /**
     * @param id_auto
     * @return
     */
    public Optional<Auto> findById(int id_auto){
        return autosRepository.findById(id_auto);
    }
    
    public Auto save(Auto a){
        return autosRepository.save(a);
    }
}
