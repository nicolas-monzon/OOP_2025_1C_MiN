package org.example.model;

import lombok.Data;

@Data
public abstract class Empleado implements Trabajador, Persona {

    private String nombre;
    protected String domicilio;
    private int legajo;

    public Empleado(String nombre, String domicilio, int legajo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.legajo = legajo;
    }

}
