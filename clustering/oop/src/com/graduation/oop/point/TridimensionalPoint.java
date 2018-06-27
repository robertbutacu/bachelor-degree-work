package com.graduation.oop.point;

public class TridimensionalPoint<A extends Number> implements Point<A> {
    private A X;
    private A Y;
    private A Z;
    private String name;

    public TridimensionalPoint(A X, A Y, A Z, String name) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }
}
