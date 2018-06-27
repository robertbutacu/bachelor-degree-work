package com.graduation.oop.space;

import com.graduation.oop.point.UnidimensionalPoint;

import java.util.List;

public class UnidimensionalSpace<A extends Number> implements Space<A, UnidimensionalPoint<A>> {
    private List<UnidimensionalPoint<A>> points;

    public UnidimensionalSpace(List<UnidimensionalPoint<A>> points) {
        this.points = points;
    }

    public UnidimensionalSpace() {
        this.points = points;
    }

    @Override
    public List<UnidimensionalPoint<A>> points() {
        return points;
    }
}
