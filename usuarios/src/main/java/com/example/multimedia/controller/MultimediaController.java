package com.example.multimedia.controller;

import com.example.multimedia.model.Multimedia;
import com.example.multimedia.service.MultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultimediaController {

    @Autowired
    private MultimediaService multimediaService;

    @GetMapping("/multimedia/{id}")
    public Multimedia getMultimedia(@PathVariable Integer id) {
        return multimediaService.findById(id);
    }
}
