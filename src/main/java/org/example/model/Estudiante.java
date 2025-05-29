package org.example.model;

import org.example.observer.EstudianteObserver;

public class Estudiante implements EstudianteObserver {
    @Override
    public void reaccionarAUnaNota(int nota) {
        System.out.println("Mi nota es " + nota);
    }
}
