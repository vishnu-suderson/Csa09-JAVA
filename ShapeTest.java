import java.util.Scanner;
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculateVolume();
}
class Sphere extends Shape {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
class Cone extends Shape {
    private double radius;
    private double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double calculateArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}
class Cylinder extends Shape {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of Sphere:");
        double sphereRadius = scanner.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Enter radius and height of Cone:");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Enter radius and height of Cylinder:");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("\nSphere:");
        System.out.println("Area = " + sphere.calculateArea());
        System.out.println("Volume = " + sphere.calculateVolume());
        System.out.println("\nCone:");
        System.out.println("Area = " + cone.calculateArea());
        System.out.println("Volume = " + cone.calculateVolume());
        System.out.println("\nCylinder:");
        System.out.println("Area = " + cylinder.calculateArea());
        System.out.println("Volume = " + cylinder.calculateVolume());
        scanner.close();
    }
}
