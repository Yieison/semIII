package com.example.normatividad.service;

import com.example.normatividad.model.Normatividad;
import com.example.normatividad.repository.NormatividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NormatividadService {

    @Autowired
    private NormatividadRepository normatividadRepository;

    public Normatividad findById(Integer id) {
        return normatividadRepository.findById(id).orElse(null);
    }
}
