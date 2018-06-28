package com.graduation.oop.point.impl;

import com.graduation.oop.point.Point;

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

    public Double getX() {
        return X.doubleValue();
    }

    public Double getY() {
        return Y.doubleValue();
    }

    public Double getZ() {
        return Z.doubleValue();
    }
}
