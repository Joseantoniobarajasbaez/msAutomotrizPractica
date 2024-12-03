package com.tecnm.automotriz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.automotriz.entity.Modelo;
import com.tecnm.automotriz.service.ModelosService;



@RestController
@RequestMapping("/modelos")
public class ModelosController {


    @Autowired
    ModelosService modelosService;

    @GetMapping("/")
    public List<Modelo> getAll() {
        return modelosService.findAll();
    }

    @GetMapping(value = "/id/{id_modelo}")
    public Optional<Modelo> findById(@PathVariable Integer id_modelo) {
        return modelosService.findById(id_modelo);
    }
    
    @PostMapping("/")
    public Modelo postMethodName(@RequestBody Modelo modelo) {        
        return modelosService.save(modelo);
    }


    

}
