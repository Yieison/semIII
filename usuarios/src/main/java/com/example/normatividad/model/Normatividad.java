package com.example.normatividad.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Normatividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idSemillero;
    private String nombreDocumento;
    private String descripcion;
    private String urlDocumento;
    private String extension;
    private Date fechaCreacion;
    private Date fechaActualizacion;
}
