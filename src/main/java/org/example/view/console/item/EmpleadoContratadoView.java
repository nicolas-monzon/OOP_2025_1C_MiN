package org.example.view.console.item;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public final class EmpleadoContratadoView extends EmpleadoView {

    private final double valorPorHora;
    private final int horasContratadas;
    private final double salario;
    private final double bonificacion;

    public EmpleadoContratadoView(String nombre,
                                  String domicilio,
                                  int legajo,
                                  double valorPorHora,
                                  int horasContratadas,
                                  double salario,
                                  double bonificacion) {
        super(nombre, domicilio, legajo);
        this.valorPorHora = valorPorHora;
        this.horasContratadas = horasContratadas;
        this.salario = salario;
        this.bonificacion = bonificacion;
    }

}
