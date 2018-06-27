package com.graduation.oop.space;

import com.graduation.oop.point.Point;

import java.util.List;

public class UnidimensionalSpace<A extends Number, Y extends Point> implements Space<A, Y> {
    private List<Y> points;

    public UnidimensionalSpace(List<Y> points) {
        this.points = points;
    }

    public UnidimensionalSpace() {
        this.points = points;
    }

    @Override
    public List<Y> points() {
        return null;
    }
}
