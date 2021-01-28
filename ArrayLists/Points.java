import java.util.*;

public class Points {

    private int x;
    private int y;

    public Points (int x, int y) {
        setPoint(x, y);
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public Points MidPoint(Points p2) {
        int x3 = (x + p2.getX()) / 2; 
        int y3 = (y + p2.getY()) / 2;
        return new Points(x3,y3);
    }

    public double OriginDistance() {
        return Math.sqrt(Math.pow((x),2) + Math.pow(x, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    //     5. Design a new class that represents a point in 2d space.
    //     Then, given a list of floating point numbers, create a new list of points from each adjacent pair of numbers in that list. For example:
    //     [0, 1 , 2, 3] with length 4, holding Integers becomes [(0, 1), (2, 3)] with length 2, holding Points


    //     6. Given a list of points, in between each pair of points insert the midpoint of those two points
    //     [(0, 1), (2, 3), (2, 5)] becomes [(0, 1), (0.5, 2), (2, 3), (2, 4), (2, 5)]


    //     7. Given a list of points, sort them by proximity to the origin




}