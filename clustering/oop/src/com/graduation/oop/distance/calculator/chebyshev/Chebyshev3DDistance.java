package com.graduation.oop.distance.calculator.chebyshev;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.TridimensionalPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chebyshev3DDistance implements DistanceCalculator<Double, TridimensionalPoint<Double>> {
    @Override
    public Double computeDistance(TridimensionalPoint<Double> A, TridimensionalPoint<Double> B) {
        List<Double> values = new ArrayList<>();
        Double XDistance = Math.abs(A.getX() - B.getX());
        Double YDistance = Math.abs(A.getY() - B.getY());
        Double ZDistance = Math.abs(A.getZ() - B.getZ());
        values.add(XDistance);
        values.add(YDistance);
        values.add(ZDistance);

        return Collections.max(values);
    }
}
