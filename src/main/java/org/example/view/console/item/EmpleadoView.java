package org.example.view.console.item;

import lombok.Data;

@Data
public abstract class EmpleadoView {

    private final String nombre;
    private final String domicilio;
    private final int legajo;

    public EmpleadoView(String nombre, String domicilio, int legajo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.legajo = legajo;
    }

}
