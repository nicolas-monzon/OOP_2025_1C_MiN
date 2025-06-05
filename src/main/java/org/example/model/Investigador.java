package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Investigador {

    private String departamento;
    private String area;
    private String cuil;
    private String nombre;
    private String apellido;
    private int edad;

}
