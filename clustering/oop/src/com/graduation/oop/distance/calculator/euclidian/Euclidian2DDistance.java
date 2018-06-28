package com.graduation.oop.distance.calculator.euclidian;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.impl.BidimensionalPoint;

public class Euclidian2DDistance implements DistanceCalculator<Double, BidimensionalPoint<Double>> {

    @Override
    public Double computeDistance(BidimensionalPoint<Double> A, BidimensionalPoint<Double> B) {
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
    }
}
