package org.example.util;

import lombok.NonNull;
import org.example.model.Contenidista;
import org.example.model.Docente;
import org.example.model.Investigador;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    // Object Mapper
    // Model Mapper
    // Facade
    private Mapper() {

    }

    // (dato -> f dato) <=> f

    public static void foo(@NonNull List<Docente> docentes) {
        int totalEdad = docentes.stream().map(Mapper::map)
                .map(Mapper::map2)
                .filter(contenidista -> contenidista.getEdad() > 20)
                .map(contenidista -> contenidista.getEdad())
                .reduce(((edad, edad2) -> edad + edad2))
                .orElse(-1);
    }

    // f: A -> B
    // g: C -> A
    // h: C -> B
    // h(x): f(g(x))
    public static Contenidista map2(Investigador investigador) {
        Contenidista contenidista = new Contenidista();
        contenidista.setDni(investigador.getCuil().substring(3, investigador.getCuil().length() - 2));
        contenidista.setNombre(investigador.getNombre());
        contenidista.setApellido(investigador.getApellido());
        contenidista.setEdad(investigador.getEdad());
        return contenidista;
    }

    public static Investigador map(Docente docente) {
        return new Investigador(
                docente.getDepartamento(),
                docente.getArea(),
                "20-" + docente.getDni() + "-6",
                docente.getNombre(),
                docente.getApellido(),
                docente.getEdad()
        );
    }

    public static Docente map(Investigador investigador) {
        Docente docente = new Docente();
        docente.setDni(investigador.getCuil().substring(3, investigador.getCuil().length() - 2));
        docente.setNombre(investigador.getNombre());
        docente.setApellido(investigador.getApellido());
        docente.setEdad(investigador.getEdad());
        return docente;
    }

    public static List<Investigador> mapAll(List<Docente> docentes) {
        List<Investigador> result = new ArrayList<>();
        for (Docente docente : docentes) {
            result.add(map(docente));
        }
        return result;
    }

    public static List<Docente> mapAll2(List<Investigador> investigadores) {
        List<Docente> result = new ArrayList<>();
        for (Investigador investigador : investigadores) {
            result.add(map(investigador));
        }
        return result;
    }

    public static List<Investigador> filterByEdad(List<Investigador> investigadores, int edad) {
        List<Investigador> result = new ArrayList<>();
        for (Investigador investigador : investigadores) {
            if (investigador.getEdad() < edad) {
                result.add(investigador);
            }
        }
        return result;
    }

    // 0 + a = a
    // "" + "..." = "..."
    // [] concatenarPila pila = pila
    public static int reduce(List<Investigador> investigadores) {
        int añosAcumulados = 0;
        for (Investigador investigador : investigadores) {
            añosAcumulados += investigador.getEdad();
        }
        return añosAcumulados;
    }

    public static Docente identidad(Docente docente) {
        return map(map(docente));
    }

    public static Investigador identidad(Investigador docente) {
        return map(map(docente));
    }


}
