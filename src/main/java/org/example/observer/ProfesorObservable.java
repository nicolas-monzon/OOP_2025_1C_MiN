package org.example.observer;

import lombok.NonNull;
import org.example.model.Nota;

import java.util.List;

public interface ProfesorObservable {

    void attach(@NonNull EstudianteObserver observer);

    void detach(EstudianteObserver observer);

    void notifyObservers(List<Nota> notas);

}
