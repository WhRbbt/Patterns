package CodeSmells.Lab5.Part2.Task15;

public class Shape {
    private double area;
    private double perimeter;

    protected Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public static Shape createCircle(double radius) {
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        return new Shape(area, perimeter);
    }

    public static Shape createRectangle(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);
        return new Shape(area, perimeter);
    }
}
