package com.graduation.oop.cluster;

import com.graduation.oop.point.Point;

import java.util.ArrayList;
import java.util.List;

public class ClusterBuilder<P extends Point<Double>> {
    private List<P> points;
    private int creationIndex = 0;
    private Cluster<P> leftCluster;
    private Cluster<P> rightCluster;

    public ClusterBuilder() {
        this.points = new ArrayList<>();
        this.leftCluster = null;
        this.rightCluster = null;
    }

    public ClusterBuilder<P> withPoints(List<P> points) {
        this.points = points;
        return this;
    }

    public ClusterBuilder<P> withCreationIndex(int creationIndex) {
        this.creationIndex = creationIndex;
        return this;
    }

    public ClusterBuilder<P> withLeftCluster(Cluster<P> leftCluster) {
        this.leftCluster = leftCluster;

        return this;
    }

    public ClusterBuilder<P> withRightCluster(Cluster<P> rightCluster) {
        this.rightCluster = rightCluster;

        return this;
    }

    public Cluster<P> build() {
        return new Cluster<>(points, creationIndex, leftCluster, rightCluster);
    }

}
