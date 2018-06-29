package com.graduation.oop.hierarchical.clustering.method.impl;

import com.graduation.oop.cluster.Cluster;
import com.graduation.oop.cluster.NewCluster;
import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.hierarchical.clustering.method.ClusteringMethod;
import com.graduation.oop.point.Point;

import java.util.ArrayList;
import java.util.List;

public class CompleteLinkage implements ClusteringMethod {
    @Override
    public NewCluster formCluster(List<Cluster> clusters, DistanceCalculator<Double, Point<Double>> distanceCalculator) {
        List<NewCluster> shortestDistancesBetweenClusters = new ArrayList<>();

        for (Cluster c1 : clusters)
            for (Cluster c2 : clusters) {
                if (!c1.equals(c2))
                    shortestDistancesBetweenClusters.add(new NewCluster(c1, c2, c1.shortestDistance(c2, distanceCalculator)));
            }

        Double minDistance = Double.MAX_VALUE;
        NewCluster result = new NewCluster();

        for(NewCluster nw: shortestDistancesBetweenClusters){
            if(nw.getDistanceBetween() < minDistance){
                minDistance = nw.getDistanceBetween();
                result = nw;
            }
        }
        return result;
    }
}
