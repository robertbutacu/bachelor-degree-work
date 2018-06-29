package com.graduation.oop.cluster;

import com.graduation.oop.point.Point;
import com.graduation.oop.point.impl.UnidimensionalPoint;

import java.util.List;

public class Cluster {
    private List<Point<Double>> points;
    private int creationIndex = 0;
    private Cluster leftCluster;
    private Cluster rightCluster;

    public Cluster(List<Point<Double>> points, int creationIndex, Cluster leftCluster, Cluster rightCluster){
        this.points = points;
        this.creationIndex = creationIndex;
        this.leftCluster = leftCluster;
        this.rightCluster = rightCluster;
    }

    public Point<Double> computeCentroid() {
        if(points.isEmpty())
            throw new IllegalArgumentException("Cluster can't be empty!");

        Point<Double> result = points.get(0);

        for(Point<Double> p: this.points){
            result.computeCentroid(p);
        }

        return result;
    }

    public List<Point<Double>> getPoints() {
        return points;
    }
}
