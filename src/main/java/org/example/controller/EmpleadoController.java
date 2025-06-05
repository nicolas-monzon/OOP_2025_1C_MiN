package org.example.controller;

import org.example.dto.EmpleadoCreation;
import org.example.error.EmptyStringException;
import org.example.error.LegajoOutOfRangeException;
import org.example.handler.EmpleadoHandler;
import org.example.model.Empleado;
import org.example.model.EmpleadoContratado;
import org.example.model.EmpleadoEnDependencia;
import org.example.view.console.item.EmpleadoContratadoView;
import org.example.view.console.item.EmpleadoCreationView;
import org.example.view.console.item.EmpleadoEnDependenciaView;
import org.example.view.console.item.EmpleadoView;

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

    public EmpleadoView darAlta(EmpleadoCreationView empleadoCreationView) { // CRUD: Create, Read, Update, Delete
        if (empleadoCreationView.nombre().isEmpty()) {
            throw new EmptyStringException("El nombre no puede estar vacio");
        }
        if (empleadoCreationView.domicilio().isEmpty()) {
            throw new EmptyStringException("El docimilio no puede estar vacio");
        }
        if (empleadoCreationView.legajo() > 0 && empleadoCreationView.legajo() < 100000) {
            throw new LegajoOutOfRangeException();
        }

        return map(empleadoHandler.darAlta(map(empleadoCreationView)));
    }

    private EmpleadoCreation map(EmpleadoCreationView empleadoCreationView) {
        return new EmpleadoCreation(
                empleadoCreationView.nombre(),
                empleadoCreationView.domicilio(),
                empleadoCreationView.legajo(),
                empleadoCreationView.sueldoBruto()
        );
    }

    private EmpleadoView map(Empleado empleado) {
        if (empleado == null) {
            return null;
        }
        if (empleado instanceof EmpleadoContratado empleadoContratado) {
            return new EmpleadoContratadoView(
                    empleadoContratado.getNombre(),
                    empleadoContratado.getDomicilio(),
                    empleadoContratado.getLegajo(),
                    empleadoContratado.getValorPorHora(),
                    empleadoContratado.getHorasContratadas(),
                    empleadoContratado.getSalario(),
                    empleadoContratado.getBonificacion());
        }
        if (empleado instanceof EmpleadoEnDependencia empleadoEnDependencia) {
            return new EmpleadoEnDependenciaView(
                    empleadoEnDependencia.getNombre(),
                    empleadoEnDependencia.getDomicilio(),
                    empleadoEnDependencia.getLegajo(),
                    empleadoEnDependencia.getSalario(),
                    empleadoEnDependencia.getBonificacion());
        }
        throw new RuntimeException("No se debe llegar a este caso");
    }

}
