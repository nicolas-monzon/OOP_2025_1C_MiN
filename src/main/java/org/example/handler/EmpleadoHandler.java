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
        Empleado empleado = new EmpleadoEnDependencia(empleadoCreation.nombre(),
                empleadoCreation.domicilio(),
                empleadoCreation.legajo(),
                empleadoCreation.sueldoBruto());
        empleados.add(empleado);
        return empleado;
    }

}
