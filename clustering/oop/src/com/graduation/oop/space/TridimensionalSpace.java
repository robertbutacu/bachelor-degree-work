package com.graduation.oop.space;

import com.graduation.oop.point.TridimensionalPoint;

import java.util.ArrayList;
import java.util.List;

public class TridimensionalSpace<A extends Number> implements Space<A, TridimensionalPoint<A>> {
    private List<TridimensionalPoint<A>> points;

    public TridimensionalSpace(List<TridimensionalPoint<A>> points) {
        this.points = points;
    }

    public TridimensionalSpace() {
        this.points = new ArrayList<TridimensionalPoint<A>>();
    }

    @Override
    public List<TridimensionalPoint<A>> points() {
        return points;
    }
}
