import java.util.Scanner;
class Box {
    private double length;
    private double width;
    private double height;
    public Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }
    public void setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double calculateVolume() {
        return length * width * height;
    }
}
public class BoxVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box box = new Box();
        System.out.println("Enter the length of the box:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the box:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the box:");
        double height = scanner.nextDouble();
        box.setDimensions(length, width, height);
        double volume = box.calculateVolume();
        System.out.println("The volume of the box is: " + volume);
        scanner.close();
    }
}
