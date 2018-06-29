package com.graduation.oop.point;

public interface Point<A> {
    public String name();
    public Point<A> computeCentroid(Point<A> another);
    public Point<A> getNeutralPoint();
}
