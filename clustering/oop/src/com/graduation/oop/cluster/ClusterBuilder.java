package com.graduation.oop.cluster;

import com.graduation.oop.point.Point;

import java.util.ArrayList;
import java.util.List;

public class ClusterBuilder {
    private List<Point<Double>> points;
    private int creationIndex = 0;
    private Cluster leftCluster;
    private Cluster rightCluster;

    public ClusterBuilder() {
        this.points = new ArrayList<>();
        this.leftCluster = null;
        this.rightCluster = null;
    }

    public ClusterBuilder withPoints(List<Point<Double>> points) {
        this.points = points;
        return this;
    }

    public ClusterBuilder withCreationIndex(int creationIndex) {
        this.creationIndex = creationIndex;
        return this;
    }

    public ClusterBuilder withLeftCluster(Cluster leftCluster) {
        this.leftCluster = leftCluster;

        return this;
    }

    public ClusterBuilder withRightCluster(Cluster rightCluster) {
        this.rightCluster = rightCluster;

        return this;
    }

    public Cluster build() {
        return new Cluster(points, creationIndex, leftCluster, rightCluster);
    }

}
