import java.util.*;

// Base class
abstract class Shape {
    abstract double area();
}

// Subclass: Circle
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}

// Utility class with generic method
class ShapeUtils {
    public static <T extends Shape> double totalArea(List<T> shapes) {
        double sum = 0;
        for (T shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}

// Main class to test
public class genericShape {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        list.add(new Circle(2));
        list.add(new Rectangle(3, 4));
        list.add(new Circle(1.5));

        double total = ShapeUtils.totalArea(list);
        System.out.println("Total area of all shapes: " + total);
    }
}
