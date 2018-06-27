package com.graduation.oop.distance.calculator.euclidian;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.TridimensionalPoint;

public class Euclidian3DDistance implements DistanceCalculator<Double, TridimensionalPoint<Double>> {

    @Override
    public Double computeDistance(TridimensionalPoint<Double> A, TridimensionalPoint<Double> B) {
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2) + Math.pow(A.getZ() - B.getZ(), 2));
    }
}
