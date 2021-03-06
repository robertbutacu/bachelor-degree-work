package com.graduation.oop.distance.calculator.chebyshev;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.impl.BidimensionalPoint;

public class Chebyshev2DDistance implements DistanceCalculator<Double, BidimensionalPoint> {
    @Override
    public Double computeDistance(BidimensionalPoint A, BidimensionalPoint B) {
        Double XDistance = Math.abs(A.getX() - B.getX());
        Double YDistance = Math.abs(A.getY() - B.getY());

        return Math.max(XDistance, YDistance);
    }
}
