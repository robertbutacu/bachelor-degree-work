package com.graduation.oop;

import com.graduation.oop.distance.calculator.euclidian.Euclidian1DDistance;
import com.graduation.oop.point.impl.UnidimensionalPoint;
import com.graduation.oop.space.impl.UnidimensionalSpace;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UnidimensionalPoint a = new UnidimensionalPoint(2.0, "A");
        UnidimensionalPoint b = new UnidimensionalPoint(4.0, "A");


        List<UnidimensionalPoint> points = new ArrayList<UnidimensionalPoint>();
        points.add(a);

        UnidimensionalSpace space = new UnidimensionalSpace(points);
        space.points().forEach(p -> System.out.println(p.name()));
        Euclidian1DDistance ed = new Euclidian1DDistance();

        System.out.println(a.computeCentroid(b));
    }
}
