package org.example.model;

import org.example.observer.EstudianteObserver;
import org.example.observer.ProfesorObservable;

import java.util.ArrayList;
import java.util.List;

public class Profesor implements ProfesorObservable {

    private final List<EstudianteObserver> observers;

    public Profesor() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(EstudianteObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(EstudianteObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(List<Nota> notas) {
        for(EstudianteObserver observer : observers) {
            if(notas.contains(observer)) {
                Nota par = notas.stream().filter(nota -> nota.getEstudiante().equals(observer))
                        .findFirst()
                        .orElse(null);
                if(par != null) {
                    observer.reaccionarAUnaNota(par.getNota());
                }
            }

        }
    }
}
