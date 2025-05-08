package org.example.controller;

import org.example.model.Empleado;
import org.example.handler.EmpleadoHandler;

public final class EmpleadoController {

    private static EmpleadoController instance2;

    private EmpleadoHandler empleadoHandler;

    private EmpleadoController() {
        empleadoHandler = EmpleadoHandler.getInstance();
    }

    public static EmpleadoController getInstance() {
        if (instance2 == null) {
            instance2 = new EmpleadoController();
        }
        return instance2;
    }

    public Empleado darAlta(String nombre, String domicilio, int legajo, int sueldoBruto) { // CRUD: Create, Read, Update, Delete
        return empleadoHandler.darAlta(nombre, domicilio, legajo, sueldoBruto);
    }

}
