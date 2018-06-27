package com.graduation.oop.space;

import com.graduation.oop.point.Point;

import java.util.ArrayList;
import java.util.List;

public class BidimensionalSpace<A extends Number, Y extends Point> implements Space<A, Y> {
    private List<Y> points;

    public BidimensionalSpace(List<Y> points) {
        this.points = points;
    }

    public BidimensionalSpace() {
        this.points = new ArrayList<Y>();
    }

    @Override
    public List<Y> points() {
        return points;
    }
}
