package com.graduation.oop.distance.calculator.manhattan;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.impl.BidimensionalPoint;

public class Manhattan2DDistance implements DistanceCalculator<Double, BidimensionalPoint<Double>> {
    @Override
    public Double computeDistance(BidimensionalPoint<Double> A, BidimensionalPoint<Double> B) {
        return Math.abs(A.getX() - B.getX()) + Math.abs(A.getY() - B.getY());
    }
}
