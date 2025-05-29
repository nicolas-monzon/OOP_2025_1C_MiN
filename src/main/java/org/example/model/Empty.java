package org.example.model;

import java.io.Serializable;

public class Empty implements Serializable {

    public boolean equals(Object o) {
        return o != null && o instanceof Empty;
    }
}
