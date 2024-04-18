package com.example.multimedia.service;

import com.example.multimedia.model.Multimedia;
import com.example.multimedia.repository.MultimediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultimediaService {

    @Autowired
    private MultimediaRepository multimediaRepository;

    public Multimedia findById(Integer id) {
        return multimediaRepository.findById(id).orElse(null);
    }
}
