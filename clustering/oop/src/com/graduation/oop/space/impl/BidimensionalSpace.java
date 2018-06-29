package com.graduation.oop.space.impl;

import com.graduation.oop.point.impl.BidimensionalPoint;
import com.graduation.oop.space.Space;

import java.util.ArrayList;
import java.util.List;

public class BidimensionalSpace implements Space<BidimensionalPoint> {
    private List<BidimensionalPoint> points;

    public BidimensionalSpace(List<BidimensionalPoint> points) {
        this.points = points;
    }

    public BidimensionalSpace() {
        this.points = new ArrayList<>();
    }

    @Override
    public List<BidimensionalPoint> points() {
        return points;
    }
}
