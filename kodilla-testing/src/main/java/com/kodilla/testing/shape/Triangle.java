package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    int side;
    int high;

    public Triangle(int side, int high) {
        this.side = side;
        this.high = high;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public int getField() {
        return (side*high)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return side == triangle.side && high == triangle.high;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, high);
    }
}
