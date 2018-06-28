package com.graduation.oop.space.impl;

import com.graduation.oop.point.impl.BidimensionalPoint;
import com.graduation.oop.space.Space;

import java.util.ArrayList;
import java.util.List;

public class BidimensionalSpace implements Space<BidimensionalPoint<Double>> {
    private List<BidimensionalPoint<Double>> points;

    public BidimensionalSpace(List<BidimensionalPoint<Double>> points) {
        this.points = points;
    }

    public BidimensionalSpace() {
        this.points = new ArrayList<>();
    }

    @Override
    public List<BidimensionalPoint<Double>> points() {
        return points;
    }
}
