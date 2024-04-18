package com.example.proyectos.service;

import com.example.proyectos.model.Proyecto;
import com.example.proyectos.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    public Proyecto findById(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }
}
