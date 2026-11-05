package org.example.generics;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class Bolsa<T> {

    private T contenido;
    private List<String> caja;

    public Bolsa(@NonNull T contenido) {
        this.contenido = contenido;
        this.caja = new ArrayList<>();
    }

    public static <R> List<R> crearBolsa(R contenido) {
        // chequea que no exista en la memoria
        Bolsa<R> bolsa = new Bolsa<R>(null);
        // crea la bolsa si no existe
        return new LinkedList<>();
    }

}
