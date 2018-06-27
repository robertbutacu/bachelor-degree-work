package com.graduation.oop.space;

import com.graduation.oop.point.Point;

import java.util.ArrayList;
import java.util.List;

public class TridimensionalSpace<A extends Number, Y extends Point> implements Space<A, Y> {
    public List<Y> points;

    public TridimensionalSpace(List<Y> points) {
        this.points = points;
    }

    public TridimensionalSpace() {
        this.points = new ArrayList<Y>();
    }

    @Override
    public List<Y> points() {
        return null;
    }
}
