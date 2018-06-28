package com.graduation.oop.hierarchical.clustering.method.impl;

import com.graduation.oop.cluster.Cluster;
import com.graduation.oop.cluster.NewCluster;
import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.hierarchical.clustering.method.ClusteringMethod;
import com.graduation.oop.point.Point;

import java.util.List;

public class AverageLinkage<P extends Point<Double>> implements ClusteringMethod<P>{
    @Override
    public NewCluster<P> formCluster(List<Cluster<P>> clusters, DistanceCalculator distanceCalculator) {
        return null;
    }
}
