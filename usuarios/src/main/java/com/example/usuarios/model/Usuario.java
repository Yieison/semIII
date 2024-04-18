package com.example.usuarios.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String nombre;
    private String apellido;
    private Boolean esIntegrante;
    private Integer idRol;
    private String codigoUniversidad;
    private Integer edad;
    private Integer semestreActual;
    private String celular;
    private Boolean enable;
}
