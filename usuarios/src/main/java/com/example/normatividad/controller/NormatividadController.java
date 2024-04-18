package com.example.normatividad.controller;

import com.example.normatividad.model.Normatividad;
import com.example.normatividad.service.NormatividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NormatividadController {

    @Autowired
    private NormatividadService normatividadService;

    @GetMapping("/normatividad/{id}")
    public Normatividad getNormatividad(@PathVariable Integer id) {
        return normatividadService.findById(id);
    }
}
