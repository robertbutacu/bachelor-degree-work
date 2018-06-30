package com.graduation.oop.hierarchical.clustering.method;

import com.graduation.oop.cluster.Cluster;
import com.graduation.oop.cluster.NewCluster;
import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.Point;

import java.util.List;

public interface ClusteringMethod {
    public NewCluster formCluster(List<Cluster> clusters, DistanceCalculator<Double, Point<Double>> distanceCalculator);
}
