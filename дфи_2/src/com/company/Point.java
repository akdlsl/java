package com.company;

public class Point {
    private double x,y;
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double dx, double dy)
    {
        return new Point(this.x + dx, this.y +=dy);
    }
    public Point scale(double mx, double my)
    {
        return new Point(this.x * mx, this.y * my);
    }
}
