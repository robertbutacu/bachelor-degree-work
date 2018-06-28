package com.graduation.oop.hierarchical.clustering;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.hierarchical.clustering.method.ClusteringMethod;
import com.graduation.oop.point.Point;
import com.graduation.oop.space.Space;

public class Algorithm<P extends Point<Double>> {
    private Space<P> space;

    public Algorithm(Space<P> space) {
        this.space = space;
    }

    public void runAlgorithm(ClusteringMethod<P> method, DistanceCalculator<Double, P> distanceCalculator) {

    }
}
