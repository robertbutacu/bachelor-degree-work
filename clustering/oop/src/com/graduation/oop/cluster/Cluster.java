package com.graduation.oop.cluster;

import com.graduation.oop.distance.calculator.DistanceCalculator;
import com.graduation.oop.point.Point;
import com.graduation.oop.point.impl.UnidimensionalPoint;

import java.util.List;
import java.util.Objects;

public class Cluster {
    private List<Point<Double>> points;
    private int creationIndex = 0;
    private Cluster leftCluster;
    private Cluster rightCluster;

    public Cluster(List<Point<Double>> points, int creationIndex, Cluster leftCluster, Cluster rightCluster) {
        this.points = points;
        this.creationIndex = creationIndex;
        this.leftCluster = leftCluster;
        this.rightCluster = rightCluster;
    }

    public Point<Double> computeCentroid() {
        if (points.isEmpty())
            throw new IllegalArgumentException("Cluster can't be empty!");

        Point<Double> result = points.get(0);

        for (Point<Double> p : this.points) {
            result.computeCentroid(p);
        }

        return result;
    }

    public List<Point<Double>> getPoints() {
        return points;
    }

    public Double shortestDistance(Cluster to, DistanceCalculator<Double, Point<Double>> distanceCalculator) {
        Double shortest = Double.MAX_VALUE;

        for (Point<Double> p1 : this.points)
            for (Point<Double> p2 : to.points) {
                Double currentDistance = distanceCalculator.computeDistance(p1, p2);

                if (currentDistance < shortest)
                    shortest = currentDistance;
            }
        return shortest;
    }

    public Double longestDistance(Cluster to, DistanceCalculator<Double, Point<Double>> distanceCalculator) {
        Double longest = Double.MIN_VALUE;

        for (Point<Double> p1 : this.points)
            for (Point<Double> p2 : to.points) {
                Double currentDistance = distanceCalculator.computeDistance(p1, p2);

                if (currentDistance > longest)
                    longest = currentDistance;
            }
        return longest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cluster cluster = (Cluster) o;
        return creationIndex == cluster.creationIndex &&
                Objects.equals(points, cluster.points) &&
                Objects.equals(leftCluster, cluster.leftCluster) &&
                Objects.equals(rightCluster, cluster.rightCluster);
    }

    @Override
    public int hashCode() {

        return Objects.hash(points, creationIndex, leftCluster, rightCluster);
    }
}
