package org.example;

import org.example.generics.Bolsa;
import org.example.model.Animal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        /*Bolsa bolsa = new Bolsa("Hola");
        bolsa.getContenido();
        Bolsa bolsa2 = new Bolsa(1);
        Bolsa<String> bolsa3 = new Bolsa<String>("Mundo");
        bolsa3.getContenido().toUpperCase(Locale.ROOT);
        */

        // eval

        // LOG4J

        Animal animal = new Animal("Flash", 60);
        if(Animal.class.equals(animal.getClass())) {

        }

        Class<Animal> animalClass = Animal.class;
        animalClass.getMethods();
        try {
            long init = System.currentTimeMillis();
            Method method = animalClass.getMethod("getName");

            method.invoke(animal);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
