package com.graduation.oop.space.impl;

import com.graduation.oop.point.impl.TridimensionalPoint;
import com.graduation.oop.space.Space;

import java.util.ArrayList;
import java.util.List;

public class TridimensionalSpace implements Space<TridimensionalPoint<Double>> {
    private List<TridimensionalPoint<Double>> points;

    public TridimensionalSpace(List<TridimensionalPoint<Double>> points) {
        this.points = points;
    }

    public TridimensionalSpace() {
        this.points = new ArrayList<TridimensionalPoint<Double>>();
    }

    @Override
    public List<TridimensionalPoint<Double>> points() {
        return points;
    }
}
