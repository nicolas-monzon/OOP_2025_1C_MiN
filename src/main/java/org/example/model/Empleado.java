package org.example.model;

public abstract class Empleado implements Trabajador, Persona {

    private String nombre;
    private String domicilio;
    private int legajo;

    public Empleado(String nombre, String domicilio, int legajo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
