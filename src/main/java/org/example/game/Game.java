package org.example.game;

public class Game {

    private static Game instance;

    private Game() {

    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

}
