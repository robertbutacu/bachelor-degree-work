package com.graduation.oop.distance.calculator.manhattan;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.impl.UnidimensionalPoint;

public class Manhattan1DDistance implements DistanceCalculator<Double, UnidimensionalPoint> {
    @Override
    public Double computeDistance(UnidimensionalPoint A, UnidimensionalPoint B) {
        return Math.abs(A.getX() - B.getX());
    }
}
