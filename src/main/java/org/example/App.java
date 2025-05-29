package org.example;

import lombok.NonNull;
import org.example.controller.EmpleadoController;
import org.example.error.EmptyStringException;
import org.example.error.LegajoOutOfRangeException;
import org.example.model.*;
import org.example.observer.EstudianteObserver;

import javax.naming.ldap.Control;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class App {

    // array -> longitud fija, random access, borrado lógico
    // list -> secuencia ordenada, admite repetidos, borrado físico
    // lista enlazada -> no tiene longitud fija, no tiene random access

    // vectores
    // coordenadas
    // pares
    // arrays bidimensionales
    // matrices
    // tuplas

    // array y list son indexados y admiten repetidos

    // [1, 2, 2, 6, 3, 9]

    // tipos de datos algebraicos -> 1, 1 (son iguales) -> nat := zero | Succ(nat)
    // tipos de datos abstractos -> List -> add, remove, get(index), size()

    // colleciones son adts


    // A < B < C < D < ... <..
    public static void main(String[] args) {
        int attempts = 0;
        while (attempts < 3) {

            attempts++;
        }
        if(attempts == 3) {
            //
        }
        EmpleadoController controller = EmpleadoController.getInstance();
        Empleado empleado;
        try(Scanner scanner = new Scanner(System.in)) {
            empleado = controller.darAlta("", "Belgrano", 123123123, 1000000);
        } catch (LegajoOutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (EmptyStringException e) {
            // 
        } catch (Exception e) {
            //
        } finally {
            try {
                empleado = controller.darAlta("", "Belgrano", 123123123, 1000000);
            } catch (Exception e) {

            }
        }


    }

    public static void foo(@NonNull List<Animal> list) {
        List<Animal> list1 = new ArrayList<>(100);
        System.out.println(list1.size());
        list1.addAll(list);

        System.out.println(list1.size());
        list1.remove(new Animal("Speed", 1));
        System.out.println(list1.size());

        if (!list.isEmpty()) {
            list.getFirst().setName("Manuelita");
            list.getLast();
        }

        // variable de objeto -> objeto  (referencia)
        // flechas que apuntan a cualquier cosa (puntero)
        // elemento -> siguiente elemento (cursores)

        for (Animal animal : list) {
            System.out.println(animal);
        }

        // LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        Integer tope = stack.pop();

        List<Integer> list2 = new ArrayList<>();
        for (Integer a : stack) {
            list2.add(a);
        }

        // FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        Integer first = queue.peek();
        queue.remove(first);
        queue.add(first);

        // Conjunto -> no admite repetidos -> no garantiza que este ordenado
        Set<Animal> set = new HashSet<>();
        for (Animal animal : set) {

        }

        set.add(new Animal("Speed", 1));
        set.add(new Animal("Speed", 1));
        set.add(new Animal("Speed", 1));
        set.add(new Animal("Speed", 1));
        set.add(new Animal("Speed", 1));

        Set<Animal> newSet = new HashSet<>(list); // UUIDv4
        list = new ArrayList<>(newSet);

        // animal -> hash -> uso el hash como posicion en donde se va a guardar
        // existe un animal en el conjunto? -> hash -> nos fijamos si esa posición está ocupada o tiene null

        // Set<Guest> init = new ...
        // Set<Guest> newGuests = new ...

        // Interseccion
        // Union
        // Resta

        // init - newGuests -> los que cancele
        // newGuests - init -> los nuevos

        Map<String, String> map = new HashMap<>();
        Map<Integer, Persona> map2 = new HashMap<>();

        map.put("tortuga", "Manuelita");
        map.put("tortuga 2", "Manuelita 2");

        if (!map.containsKey("tortuga")) {
            map.put("tortuga", "Manuelita 2");
        }

        Map<String, List<String>> diccionarioMultiple = new HashMap<>();
        for (Map.Entry<String, List<String>> fila : diccionarioMultiple.entrySet()) {
            System.out.println(fila.getKey());
            System.out.println(fila.getValue());
        }

        map.get("tortuga");

        map.remove("tortuga");


        Map<Integer, Map<Integer, Map<String, Persona>>> map3 = new HashMap<>();
        var map4 = map3;


        System.out.println(set.size());


        Stack<Integer> stack2 = new Stack<>();
        List<Integer> example = List.copyOf(stack2);
        example.add(6);

        // atributo2: List<List<A>>
        // atributo: Map

        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        list.remove(1);
        List<Integer> listB = new ArrayList<>();
    }

    private static void observerExample() {
        Estudiante estudiante = new Estudiante();
        Estudiante estudiante2 = new Estudiante();

        Profesor profesor = new Profesor();
        profesor.attach(estudiante);
        profesor.attach(estudiante2);

        List<Nota> notas = new ArrayList<>();
        Nota nota1 = new Nota(estudiante, 10);
        Nota nota2 = new Nota(estudiante2, 8);
        notas.add(nota1);
        notas.add(nota2);

        profesor.notifyObservers(notas);
    }
}
