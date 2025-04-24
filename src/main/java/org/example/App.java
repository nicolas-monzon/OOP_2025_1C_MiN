package org.example;

import org.example.computer.Mouse;
import org.example.tortoise.Reptil;
import org.example.tortoise.Testudin;
import org.example.tortoise.Tortuga;

public class App {

    public static void main(String[] args) {
        Tortuga t = new Tortuga();
        Testudin td = new Testudin();
        Reptil r = new Reptil();

        System.out.println(Reptil.class.equals(t.getClass()));
        System.out.println(Reptil.class.equals(td.getClass()));
        System.out.println(Reptil.class.equals(r.getClass()));

        System.out.println();

        System.out.println(t instanceof Reptil);
        System.out.println(td instanceof Reptil);
        System.out.println(r instanceof Reptil);

        System.out.println();

        System.out.println(Reptil.class.equals(t.getClass()) || Testudin.class.equals(t.getClass()) || Tortuga.class.equals(t.getClass()));
        System.out.println(Reptil.class.equals(td.getClass()) || Testudin.class.equals(td.getClass()) || Tortuga.class.equals(td.getClass()));
        System.out.println(Reptil.class.equals(r.getClass()) || Testudin.class.equals(r.getClass()) || Tortuga.class.equals(r.getClass()));

        Mouse.Wire wire = new Mouse.Wire(10);
    }

}
