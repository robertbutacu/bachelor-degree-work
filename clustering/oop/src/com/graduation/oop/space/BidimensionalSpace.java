package com.graduation.oop.space;

import com.graduation.oop.point.BidimensionalPoint;

import java.util.ArrayList;
import java.util.List;

public class BidimensionalSpace<A extends Number> implements Space<A, BidimensionalPoint<A>> {
    private List<BidimensionalPoint<A>> points;

    public BidimensionalSpace(List<BidimensionalPoint<A>> points) {
        this.points = points;
    }

    public BidimensionalSpace() {
        this.points = new ArrayList<BidimensionalPoint<A>>();
    }

    @Override
    public List<BidimensionalPoint<A>> points() {
        return points;
    }
}
