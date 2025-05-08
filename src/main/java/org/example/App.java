package org.example;

import org.example.controller.EmpleadoController;
import org.example.model.*;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpleadoController controller = EmpleadoController.getInstance();
        System.out.println("""
                Elija una de las siguientes opciones:
                1. Dar de alta un empleado
                2. Salir
                """);

        int opcion;
        while (true) {
            try {
                opcion = sc.nextInt();
                break;
            } catch (RuntimeException e) {
                System.out.println("Ingrese un valor numérico");
                sc.nextLine(); // Faltaba limpiar el buffer
            }
        }

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

        /*Pato pato = new Pato("Lucas", "pato", 10);
        Pato pato2 = new Pato();

        Pato[] patos = new Pato[2];
        // [null, null]

        patos[0] = pato;
        // [pato, null]

        for(int i = 0; i < patos.length; i++) {
            System.out.println(patos[i]);
        }

        int[] a = { 1, 2, 3 };
        double[] x = new double[a.length];
        for(int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }

        Animal[] arreglo = new Animal[3];
        arreglo[0] = new Tortuga();
        arreglo[1] = new Tortuga();
        arreglo[2] = pato;

        for(int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] instanceof Tortuga t) {
                System.out.println(t);
            }
        }

        Type type = Type.CORAZON;
        String text = PartesDeLaComputadora.MOUSE.name();
        System.out.println(text);

        String test = "..";

        Color color = Color.getColorByName("RED");*/
    }

}
