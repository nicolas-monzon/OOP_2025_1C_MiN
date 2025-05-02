package org.example.model;

public final class EmpleadoEnDependencia extends Empleado {

    private double sueldoBruto;

    public EmpleadoEnDependencia(String nombre, String domicilio, int legajo, double sueldoBruto) {
        super(nombre, domicilio, legajo);
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoNeto() {
        return sueldoBruto - 0.13*sueldoBruto;
    }

    @Override
    public double getSalario() {
        return getSueldoNeto();
    }

    @Override
    public double getBonificacion() {
        return 0;
    }

    @Override
    public String toString() {
        return "EmpleadoEnDependencia{" +
                "sueldoBruto=" + sueldoBruto +
                super.toString() +
                '}';
    }
}
