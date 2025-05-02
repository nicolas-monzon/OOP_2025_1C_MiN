package org.example.model;

public class Jefe implements Trabajador {
    @Override
    public double getSalario() {
        return 1000;
    }

    @Override
    public double getBonificacion() {
        return 0;
    }
}
