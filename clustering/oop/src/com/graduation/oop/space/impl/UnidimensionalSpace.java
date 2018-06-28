package com.graduation.oop.space.impl;

import com.graduation.oop.point.impl.UnidimensionalPoint;
import com.graduation.oop.space.Space;

import java.util.List;

public class UnidimensionalSpace implements Space<UnidimensionalPoint<Double>> {
    private List<UnidimensionalPoint<Double>> points;

    public UnidimensionalSpace(List<UnidimensionalPoint<Double>> points) {
        this.points = points;
    }

    public UnidimensionalSpace() {
        this.points = points;
    }

    @Override
    public List<UnidimensionalPoint<Double>> points() {
        return points;
    }
}
