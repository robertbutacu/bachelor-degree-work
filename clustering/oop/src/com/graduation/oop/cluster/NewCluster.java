package com.graduation.oop.cluster;

import com.graduation.oop.point.Point;

import java.util.ArrayList;
import java.util.List;

public class NewCluster {
    private Cluster firstCluster;
    private Cluster secondCluster;
    private Double distanceBetween;

    public NewCluster(Cluster firstCluster, Cluster secondCluster, Double distanceBetween) {
        this.firstCluster = firstCluster;
        this.secondCluster = secondCluster;
        this.distanceBetween = distanceBetween;
    }

    public Cluster createCluster(int creationIndex ){
        List<Point<Double>> points = new ArrayList<>(firstCluster.getPoints());
        points.addAll(secondCluster.getPoints());

        ClusterBuilder cb = new ClusterBuilder();
        cb.withCreationIndex(creationIndex)
                .withLeftCluster(this.firstCluster)
                .withRightCluster(this.secondCluster)
                .withPoints(points);

        return cb.build();
    }
}
