package org.example.view.console;

import org.example.controller.EmpleadoController;
import org.example.error.EmptyStringException;
import org.example.error.LegajoOutOfRangeException;
import org.example.view.console.enums.Option;
import org.example.view.console.item.EmpleadoCreationView;
import org.example.view.console.item.EmpleadoView;

import java.util.Scanner;

public final class Console {

    private static Console instance;
    private final EmpleadoController controller;
    private final Scanner scanner;

    private Console() {
        controller = EmpleadoController.getInstance();
        scanner = new Scanner(System.in);
    }

    public static Console getInstance() {
        if (instance == null) {
            instance = new Console();
        }
        return instance;
    }

    public void run() {
        System.out.println("Welcome to the console!");

        String name = getName();
        System.out.println(
                """
                Select an option: 
                1. Create new employee
                2. Remove employee
                3. Exit
                """);
        int optionIndex = scanner.nextInt();
        Option option = Option.getFromIndex(optionIndex);

        if(Option.DAR_DE_ALTA.equals(option)) {

        }

        //

        EmpleadoCreationView empleadoCreationView = new EmpleadoCreationView(name,
                "Belgrano",
                123123123,
                1000000);
        EmpleadoView empleado;
        try (Scanner scanner = new Scanner(System.in)) {
            empleado = controller.darAlta(empleadoCreationView);
        } catch (LegajoOutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (EmptyStringException e) {
            //
        } catch (Exception e) {
            //
        } finally {

            try {
                empleado = controller.darAlta(empleadoCreationView);
            } catch (Exception e) {

            }
        }

        //...
        end();
    }


    private int getOption() {
        System.out.println("Enter your option: ");
        int option;
        do {
            option = scanner.nextInt();
            if(isValid(option)) {
                break;
            }
            System.out.println("Invalid option. Please enter another one.");
        } while(true);
        return option;
    }

    private String getName() {
        System.out.println("Enter your name: ");
        String name;
        do {
            name = scanner.nextLine();
            if(isValid(name)) {
                break;
            }
            System.out.println("Invalid name. Please enter another one.");
        } while(true);
        return name;
    }

    private boolean isValid(int option) {
        return option >= 1 && option <= 3;
    }

    private boolean isValid(String name) {
        return true;
    }

    private void end() {
        this.scanner.close();
    }

}
