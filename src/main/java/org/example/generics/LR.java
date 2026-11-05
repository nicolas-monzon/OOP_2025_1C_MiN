package org.example.generics;

import lombok.Getter;

@Getter
public class LR<L, R> {

    private L left;
    private R right;

    public LR(L left) {
        this.left = left;
    }

    public LR(R right, boolean x) {
        this.right = right;
    }

    public boolean existeL() {
        return this.left != null;
    }

    public boolean existeR() {
        return this.right != null;
    }
}
