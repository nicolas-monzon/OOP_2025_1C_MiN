package org.example.model;

import lombok.ToString;

@ToString
public final class EmpleadoContratado extends Empleado {

    private double valorPorHora;
    private int horasContratadas;

    public EmpleadoContratado(String nombre, String domicilio, int legajo, double valorPorHora, int horasContratadas) {
        super(nombre, domicilio, legajo);
        this.valorPorHora = valorPorHora;
        this.horasContratadas = horasContratadas;
    }

    public double sueltoTotal() {
        return valorPorHora * horasContratadas;
    }

    @Override
    public double getSalario() {
        return sueltoTotal();
    }

    @Override
    public double getBonificacion() {
        return 0;
    }

}
