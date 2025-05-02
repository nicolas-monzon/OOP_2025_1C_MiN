package org.example.handler;

import org.example.model.Empleado;
import org.example.model.EmpleadoEnDependencia;

import java.util.ArrayList;
import java.util.List;

public final class EmpleadoHandler {

    private static EmpleadoHandler instance;

    private List<Empleado> empleados;

    private EmpleadoHandler() {
        empleados = new ArrayList<>();
    }

    public static EmpleadoHandler getInstance() {
        if (instance == null) {
            instance = new EmpleadoHandler();
        }
        return instance;
    }

    public Empleado darAlta(String nombre, String domicilio, int legajo, int sueldoBruto) {
        Empleado empleado = new EmpleadoEnDependencia(nombre, domicilio, legajo, sueldoBruto);
        empleados.add(empleado);
        return empleado;
    }

}
