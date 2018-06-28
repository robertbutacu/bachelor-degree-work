package com.graduation.oop.point.impl;


import com.graduation.oop.point.Point;

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

    public Double getX() {
        return X.doubleValue();
    }
}
