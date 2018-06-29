package com.graduation.oop.hierarchical.clustering.method;

import com.graduation.oop.cluster.Cluster;
import com.graduation.oop.cluster.NewCluster;
import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.Point;

import java.util.List;

public interface ClusteringMethod {
    //TODO use factory to instantiate the distance calculator
    public NewCluster formCluster(List<Cluster> clusters, DistanceCalculator<Double, Point<Double>> distanceCalculator);
}
