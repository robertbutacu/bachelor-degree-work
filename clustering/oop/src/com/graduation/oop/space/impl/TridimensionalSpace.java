package com.graduation.oop.space.impl;

import com.graduation.oop.point.impl.TridimensionalPoint;
import com.graduation.oop.space.Space;

import java.util.ArrayList;
import java.util.List;

public class TridimensionalSpace implements Space<TridimensionalPoint> {
    private List<TridimensionalPoint> points;

    public TridimensionalSpace(List<TridimensionalPoint> points) {
        this.points = points;
    }

    public TridimensionalSpace() {
        this.points = new ArrayList<>();
    }

    @Override
    public List<TridimensionalPoint> points() {
        return points;
    }
}
