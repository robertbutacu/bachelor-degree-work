package com.graduation.oop.distance.calculator.chebyshev;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.UnidimensionalPoint;

public class Chebyshev1DDistance implements DistanceCalculator<Double, UnidimensionalPoint<Double>> {
    @Override
    public Double computeDistance(UnidimensionalPoint<Double> A, UnidimensionalPoint<Double> B) {
        return Math.abs(A.getX() - B.getX());
    }
}
