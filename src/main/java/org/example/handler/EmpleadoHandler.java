package org.example.handler;

import org.example.dto.EmpleadoCreation;
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

    public Empleado darAlta(EmpleadoCreation empleadoCreation) {
        return null;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "EmpleadoHandler{" +
                "empleados=" + empleados +
                '}';
    }
}
