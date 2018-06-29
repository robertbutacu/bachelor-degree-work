package com.graduation.oop.point.impl;


import com.graduation.oop.point.Point;

public class UnidimensionalPoint implements Point<Double> {
    private Double X;
    private String name;

    public UnidimensionalPoint(Double X, String name) {
        this.X = X;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Point<Double> computeCentroid(Point<Double> another) {
        if(!(another instanceof UnidimensionalPoint))
            throw new IllegalArgumentException("Cannot compute distance to a non-unidimensional point!");

        UnidimensionalPoint casted = (UnidimensionalPoint) another;
        return new UnidimensionalPoint(this.X + casted.X, this.name.concat(casted.name));
    }

    @Override
    public Point<Double> getNeutralPoint() {
        return new UnidimensionalPoint(0.0, "");
    }

    public Double getX() {
        return X;
    }
}
