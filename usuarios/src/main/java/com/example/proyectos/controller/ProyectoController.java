package com.example.proyectos.controller;

import com.example.proyectos.model.Proyecto;
import com.example.proyectos.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

    @GetMapping("/proyectos/{id}")
    public Proyecto getProyecto(@PathVariable Long id) {
        return proyectoService.findById(id);
    }
}
