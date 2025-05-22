package org.example.controller;

import org.example.error.EmptyStringException;
import org.example.error.LegajoOutOfRangeException;
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
        if (nombre.isEmpty()) {
            throw new EmptyStringException("El nombre no puede estar vacio");
        }
        if (domicilio.isEmpty()) {
            throw new EmptyStringException("El docimilio no puede estar vacio");
        }
        if (legajo > 0 && legajo < 100000) {
            throw new LegajoOutOfRangeException();
        }

        Integer.parseInt("A");

        return empleadoHandler.darAlta(nombre, domicilio, legajo, sueldoBruto);
    }

}
