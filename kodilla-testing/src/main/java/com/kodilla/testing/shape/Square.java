package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public int getField() {
        return size*size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return size == square.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
