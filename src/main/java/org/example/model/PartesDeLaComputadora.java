package org.example.model;

import lombok.Getter;

@Getter
public enum PartesDeLaComputadora {

    PANTALLA(10),
    TECLADO(4),
    MOUSE(1);

    private double peso;

    PartesDeLaComputadora(double peso) {
        this.peso = peso;
    }

    public void imprimirPeso() {
        System.out.println(peso);
    }

}
