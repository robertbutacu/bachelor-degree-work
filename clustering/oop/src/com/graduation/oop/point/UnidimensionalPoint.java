package com.graduation.oop.point;


public class UnidimensionalPoint<A extends Number> implements Point<A> {
    private A X;
    private String name;

    public UnidimensionalPoint(A X, String name) {
        this.X = X;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
