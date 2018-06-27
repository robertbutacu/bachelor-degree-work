package com.graduation.oop.cluster;

import com.graduation.oop.point.Point;

import java.util.List;

public class Cluster<P extends Point<Double>> {
    private List<P> points;
    private int creationIndex = 0;
    private Cluster<P> leftCluster;
    private Cluster<P> rightCluster;

    public Cluster(List<P> points, int creationIndex, Cluster<P> leftCluster, Cluster<P> rightCluster){
        this.points = points;
        this.creationIndex = creationIndex;
        this.leftCluster = leftCluster;
        this.rightCluster = rightCluster;
    }

    public List<P> getPoints() {
        return points;
    }
}
