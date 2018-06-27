package com.graduation.oop.cluster;

import com.graduation.oop.point.Point;

import java.util.ArrayList;
import java.util.List;

public class NewCluster<P extends Point<Double>> {
    private Cluster<P> firstCluster;
    private Cluster<P> secondCluster;
    private Double distanceBetween;

    public NewCluster(Cluster<P> firstCluster, Cluster<P> secondCluster, Double distanceBetween) {
        this.firstCluster = firstCluster;
        this.secondCluster = secondCluster;
        this.distanceBetween = distanceBetween;
    }

    public Cluster<P> createCluster(int creationIndex ){
        List<P> points = new ArrayList<>(firstCluster.getPoints());
        points.addAll(secondCluster.getPoints());

        ClusterBuilder<P> cb = new ClusterBuilder<>();
        cb.withCreationIndex(creationIndex)
                .withLeftCluster(this.firstCluster)
                .withRightCluster(this.secondCluster)
                .withPoints(points);

        return cb.build();
    }
}
