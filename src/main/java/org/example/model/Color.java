package org.example.model;

import java.util.Arrays;

public enum Color {
    RED,
    GREEN,
    BLUE;

    public static Color getColorByName(String colorName) {
        return Arrays.asList(Color.values()).stream()
                .filter(c -> c.name().equalsIgnoreCase(colorName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid color: " + colorName));
    }
}
