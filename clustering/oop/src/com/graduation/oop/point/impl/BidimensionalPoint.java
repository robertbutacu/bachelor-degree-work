package com.graduation.oop.point.impl;

import com.graduation.oop.point.Point;

public class BidimensionalPoint implements Point<Double> {
    private Double X;
    private Double Y;
    private String name;

    public BidimensionalPoint(Double X, Double Y, String name) {
        this.X = X;
        this.Y = Y;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Point<Double> computeCentroid(Point<Double> another) {
        if(!(another instanceof BidimensionalPoint))
            throw new IllegalArgumentException("Can't compare Bidimensional point with non-bidimensional point!");

        BidimensionalPoint casted = (BidimensionalPoint) another;

        Double X = this.X + casted.X;
        Double Y = this.Y + casted.Y;

        return new BidimensionalPoint(X / 2.0, Y / 2.0, this.name.concat(casted.name));
    }

    @Override
    public Point<Double> getNeutralPoint() {
        return new BidimensionalPoint(0.0, 0.0, "");
    }

    public Double getX() {
        return X;
    }

    public Double getY() {
        return Y;
    }
}
