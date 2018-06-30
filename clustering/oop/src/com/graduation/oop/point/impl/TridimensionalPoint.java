package com.graduation.oop.point.impl;

import com.graduation.oop.point.Point;

public class TridimensionalPoint implements Point<Double> {
    private Double X;
    private Double Y;
    private Double Z;
    private String name;

    public TridimensionalPoint(Double X, Double Y, Double Z, String name) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Point<Double> computeCentroid(Point<Double> another) {
        if (!(another instanceof TridimensionalPoint))
            throw new IllegalArgumentException("Cannot get centroid with non-tridimensional point!");

        TridimensionalPoint casted = (TridimensionalPoint) another;
        Double X = this.X + casted.X;
        Double Y = this.Y + casted.Y;
        Double Z = this.Z + casted.Z;

        return new TridimensionalPoint(X / 3.0, Y / 3.0, Z / 3.0, this.name.concat(casted.name));
    }

    @Override
    public Point<Double> getNeutralPoint() {
        return new TridimensionalPoint(0.0, 0.0, 0.0, "");
    }

    @Override
    public Point<Double> clone() {
        return new TridimensionalPoint(this.X, this.Y, this.Z, this.name);
    }

    public Double getX() {
        return X;
    }

    public Double getY() {
        return Y;
    }

    public Double getZ() {
        return Z;
    }
}
