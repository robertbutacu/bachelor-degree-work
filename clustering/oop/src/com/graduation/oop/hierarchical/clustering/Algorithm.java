package com.graduation.oop.hierarchical.clustering;

import com.graduation.oop.cluster.Cluster;
import com.graduation.oop.cluster.NewCluster;
import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.hierarchical.clustering.method.ClusteringMethod;
import com.graduation.oop.point.Point;

import java.util.List;

public class Algorithm {
    private List<Cluster> clusters;

    public Algorithm(List<Cluster> space) {
        this.clusters = space;
    }

    public void runAlgorithm(ClusteringMethod method, DistanceCalculator<Double, Point<Double>> distanceCalculator) {
        Integer creationIndex = 0;
        while (clusters.size() > 1) {
            NewCluster nc = method.formCluster(this.clusters, distanceCalculator);

            removeDuplicateClusters(nc);
            clusters.add(nc.createCluster(creationIndex));
            creationIndex++;
        }
    }

    private void removeDuplicateClusters(NewCluster newCluster) {
        for (Cluster c : clusters) {
            if (newCluster.containsCluster(c))
                clusters.remove(c);
        }
    }
}
