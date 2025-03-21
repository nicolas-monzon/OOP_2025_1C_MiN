package org.example;

public class App {

    /*
    Una agenda personal permita registrar reuniones en las que el usuario va a participar. En tal agenda debe
    registrarse donde ocurrirá la reunión, quienes van a participar de ella, el tema que van a tratar y la duración de
    la misma

    - Agenda -> Clase
    - Reunion -> Clase
    - Usuario -> No lo considero
    - Ubicación -> String
    - Participantes -> String[]
    - Tema -> String
    - Duración -> byte
     */
    public static void main(String[] args) {
        Calendar cal = new Calendar();
        String[] guests = {"Albert", "Bob", "Charlie", "David", "Elena"};
        Meeting meeting = new Meeting("Lima", guests, (byte) 30);
    }

}
