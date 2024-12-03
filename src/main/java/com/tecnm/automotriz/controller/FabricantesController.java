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

import com.tecnm.automotriz.entity.Fabricante;
import com.tecnm.automotriz.service.FabricantesService;


@RestController
@RequestMapping("/fabricantes")
public class FabricantesController {


    @Autowired
    FabricantesService fabricantesService;

    @GetMapping("/")
    public List<Fabricante> getAll() {
        return fabricantesService.findAll();
    }

    @GetMapping(value = "/id/{id_fabricante}")
    public Optional<Fabricante> findById(@PathVariable Integer id_fabricante) {
        return fabricantesService.findById(id_fabricante);
    }

    @PostMapping("/")
    public Fabricante postMethodName(@RequestBody Fabricante fabricante) {        
        return fabricantesService.save(fabricante);
    }
    

}
