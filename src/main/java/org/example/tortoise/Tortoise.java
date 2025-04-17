package org.example.tortoise;

public record Tortoise(String name, String color) {

    public void getVelocity() {
        System.out.println(2*name.length());
    }

}
