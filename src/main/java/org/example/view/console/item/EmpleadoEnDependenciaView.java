package org.example.view.console.item;

public final class EmpleadoEnDependenciaView extends EmpleadoView {

    private final double sueldoBruto;
    private final double sueldoNeto;

    public EmpleadoEnDependenciaView(final String nombre,
                                     final String domicilio,
                                     final int legajo,
                                     final double sueldoBruto,
                                     final double sueldoNeto) {
        super(nombre, domicilio, legajo);
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
    }
}
