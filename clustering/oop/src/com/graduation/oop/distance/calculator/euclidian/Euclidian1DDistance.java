package com.graduation.oop.distance.calculator.euclidian;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.impl.UnidimensionalPoint;

public class Euclidian1DDistance implements DistanceCalculator<Double, UnidimensionalPoint> {

    @Override
    public Double computeDistance(UnidimensionalPoint A, UnidimensionalPoint B) {
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2));
    }
}
