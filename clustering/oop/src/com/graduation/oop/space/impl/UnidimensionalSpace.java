package com.graduation.oop.space.impl;

import com.graduation.oop.point.impl.UnidimensionalPoint;
import com.graduation.oop.space.Space;

import java.util.List;

public class UnidimensionalSpace implements Space<UnidimensionalPoint> {
    private List<UnidimensionalPoint> points;

    public UnidimensionalSpace(List<UnidimensionalPoint> points) {
        this.points = points;
    }

    public UnidimensionalSpace() {
        this.points = points;
    }

    @Override
    public List<UnidimensionalPoint> points() {
        return points;
    }
}
