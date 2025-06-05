package org.example.view.console.enums;

public enum Option {

    DAR_DE_ALTA,
    DAR_DE_BAJA,
    SALIR;

    public static Option getFromIndex(int index) {
        if(index == 1) {
            return DAR_DE_ALTA;
        }
        if(index == 2) {
            return DAR_DE_BAJA;
        }
        if(index == 3) {
            return SALIR;
        }
        throw new RuntimeException("Invalid index");
    }

}
