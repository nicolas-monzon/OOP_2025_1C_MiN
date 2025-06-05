package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Docente {

    private String departamento;
    private String area;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

}
