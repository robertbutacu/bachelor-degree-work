package com.graduation.oop;

import com.graduation.oop.point.BidimensionalPoint;
import com.graduation.oop.point.UnidimensionalPoint;
import com.graduation.oop.space.BidimensionalSpace;
import com.graduation.oop.space.UnidimensionalSpace;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UnidimensionalPoint<Double> a = new UnidimensionalPoint<Double>(2.0, "A");

        List<UnidimensionalPoint<Double>> points = new ArrayList<UnidimensionalPoint<Double>>();
        points.add(a);

        UnidimensionalSpace<Double> space = new UnidimensionalSpace<Double>(points);
        space.points().forEach(p -> System.out.println(p.name()));
    }
}
