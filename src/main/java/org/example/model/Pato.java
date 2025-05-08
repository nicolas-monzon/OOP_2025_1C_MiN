package org.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
public class Pato extends Animal {
    private String nombre;

    @Getter
    private String especie;

    @Getter
    private int edad;

    public String example(String text) {
        System.out.println(text);
        return text;
    }
}
