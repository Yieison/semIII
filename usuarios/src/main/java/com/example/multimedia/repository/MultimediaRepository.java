package com.example.multimedia.repository;

import com.example.multimedia.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultimediaRepository extends JpaRepository<Multimedia, Integer> {
}
