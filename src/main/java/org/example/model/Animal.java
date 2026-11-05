package org.example.model;

import lombok.*;

@AllArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
public class Animal {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        long init = System.currentTimeMillis();
        int age2 = age;
        long end = System.currentTimeMillis();
        System.out.println("El método getAge tardó " + (end - init) + " milisegundos");
        return age;
    }
}
