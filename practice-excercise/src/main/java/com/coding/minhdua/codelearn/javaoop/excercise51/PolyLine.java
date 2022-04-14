package com.coding.minhdua.codelearn.javaoop.excercise51;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double result = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            result += distance(points.get(i),points.get(i + 1));
        }
        return result;
    }

    private double distance(Point point1, Point point2) {
        double dx = (double) point1.getX() - point1.getX();
        double dy = (double) point2.getY() - point2.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
}