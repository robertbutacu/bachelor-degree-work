package com.graduation.oop.distance.calculator.manhattan;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.impl.TridimensionalPoint;

public class Manhattan3DDistance implements DistanceCalculator<Double, TridimensionalPoint<Double>> {
    @Override
    public Double computeDistance(TridimensionalPoint<Double> A, TridimensionalPoint<Double> B) {
        return Math.abs(A.getX() - B.getX()) + Math.abs(A.getY() - B.getY()) + Math.abs(A.getZ() - B.getZ());
    }
}
