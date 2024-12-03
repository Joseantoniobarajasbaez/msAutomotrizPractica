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

import com.tecnm.automotriz.entity.Auto;
import com.tecnm.automotriz.service.AutosService;


@RestController
@RequestMapping("/autos")
public class AutosController {


    @Autowired
    AutosService autosService;

    @GetMapping("/")
    public List<Auto> getAll() {
        return autosService.findAll();
    }

    @GetMapping(value = "/id/{id_auto}")
    public Optional<Auto> findById(@PathVariable Integer id_auto) {
        return autosService.findById(id_auto);
    }

    
    @PostMapping("/")
    public Auto postMethodName(@RequestBody Auto auto) {        
        return autosService.save(auto);
    }
    

}
