package com.graduation.oop.space;

import com.graduation.oop.point.Point;

import java.util.List;

public interface Space<Y extends Point<Double>> {
    public List<Y> points();
}
