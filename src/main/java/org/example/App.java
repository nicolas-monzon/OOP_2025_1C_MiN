package org.example;

import org.example.controller.EmpleadoController;
import org.example.model.Empleado;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpleadoController controller = EmpleadoController.getInstance();

        System.out.println("""
                Elija una de las siguientes opciones:
                1. Dar de alta un empleado
                2. Salir
                """);

        int opcion = sc.nextInt();

        if(opcion == 1) {
            System.out.println("Ingrese el sueldo bruto del empleado: ");
            int sueldoBruto = sc.nextInt();

            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = sc.next();

            System.out.println("Ingrese el domicilio del empleado: ");
            String domicilio = sc.next();

            System.out.println("Ingrese el legajo del empleado: ");
            int legajo = sc.nextInt();

            Empleado empleado = controller.darAlta(nombre, domicilio, legajo, sueldoBruto);
            System.out.println(empleado);
            sc.close();
            System.exit(0);
            return;
        }

        if(opcion == 2) {
            System.out.println("Nos" + " vemos!");
            sc.close();
            System.exit(0);
            return;
        }

        sc.close();
    }

}
