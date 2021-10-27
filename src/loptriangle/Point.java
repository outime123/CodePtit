package loptriangle;

import java.util.Scanner;

public class Point {
    private float x,y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public static  Point nextPoint(Scanner scanner){
        return new Point(scanner.nextFloat(),scanner.nextFloat());
    }
    public float khoangCach(Point point){
        return (float) Math.sqrt((x-point.getX())*(x-point.getX())+(y-point.getY())*(y-point.getY()));
    }
}
