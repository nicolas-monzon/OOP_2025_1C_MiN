package org.example.model;

import lombok.Data;

public class Polinomio {

    private Par[] pares;
    private int count;

    public Polinomio() {
        pares = new Par[10];
    }

    public void add() {
        Par par = null; // Aca se arma con datos pedidos en consola
        if (count == pares.length) {
            throw new RuntimeException();
        }
        pares[count] = par;
        count++;
    }

    public double eval(double x) {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += pares[i].eval(x);
        }
        return total;
    }

    @Data
    private class PolinomioAtomico {

        private int grado;

        public double eval(double x) {
            return Math.pow(x, grado);
        }

    }

    @Data
    class Par {

        private double coeficiente;
        private PolinomioAtomico polinomioAtomico;

        public double eval(double x) {
            return coeficiente * polinomioAtomico.eval(x);
        }
    }
}
