package org.example.computer;

import java.util.Objects;
import java.util.Optional;

public class Mouse {

    public static class Wire {

        private int length;

        public Wire(int length) {
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }

    private int size;
    private Optional<Wire> wire;

    public Mouse(int size) {
        this.size = size;
        this.wire = Optional.empty();
    }

    public void fillWire(Wire wire) {
        this.wire = Optional.of(wire);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Optional<Wire> getWire() {
        return wire;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "size=" + size +
                ", wire=" + wire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mouse mouse = (Mouse) o;
        return size == mouse.size && Objects.equals(wire, mouse.wire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, wire);
    }
}
