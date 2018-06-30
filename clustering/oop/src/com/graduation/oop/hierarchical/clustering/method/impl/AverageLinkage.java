package com.graduation.oop.hierarchical.clustering.method.impl;

import com.graduation.oop.cluster.Cluster;
import com.graduation.oop.cluster.NewCluster;
import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.hierarchical.clustering.method.ClusteringMethod;
import com.graduation.oop.point.Point;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class AverageLinkage implements ClusteringMethod {
    @Override
    public NewCluster formCluster(List<Cluster> clusters,
                                  DistanceCalculator<Double, Point<Double>> distanceCalculator) {
        List<Pair<Cluster, Point<Double>>> possibleClusters = new ArrayList<>();

        for (Cluster c : clusters)
            possibleClusters.add(new Pair<>(c, c.computeCentroid()));

        List<NewCluster> clustersFormed = new ArrayList<>();

        for (Pair<Cluster, Point<Double>> c1 : possibleClusters)
            for (Pair<Cluster, Point<Double>> c2 : possibleClusters)
                if (!c1.getKey().equals(c2.getKey()))
                    clustersFormed.add(
                            new NewCluster(c1.getKey(),
                                    c2.getKey(),
                                    distanceCalculator.computeDistance(c1.getValue(), c2.getValue())));

        Double minDistance = Double.MAX_VALUE;
        NewCluster result = new NewCluster();

        for (NewCluster nc : clustersFormed)
            if (minDistance > nc.getDistanceBetween())
                result = nc;

        return result;
    }
}
