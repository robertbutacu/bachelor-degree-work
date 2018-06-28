package com.graduation.oop.point.impl;

import com.graduation.oop.point.Point;

public class BidimensionalPoint<A extends Number> implements Point<A> {
    private A X;
    private A Y;
    private String name;

    public BidimensionalPoint(A X, A Y, String name) {
        this.X = X;
        this.Y = Y;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    public Double getX() {
        return X.doubleValue();
    }

    public Double getY() {
        return Y.doubleValue();
    }
}
