class Vehicle {
    private String licensePlate;
    private String owner;

    public Vehicle(String licensePlate, String owner) {
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void displayInfo() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner: " + owner);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String licensePlate, String owner, int numberOfDoors) {
        super(licensePlate, owner);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String licensePlate, String owner, double loadCapacity) {
        super(licensePlate, owner);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String owner, boolean hasSidecar) {
        super(licensePlate, owner);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "John Doe", 4);
        Truck truck = new Truck("XYZ789", "Jane Doe", 10);
        Motorcycle motorcycle = new Motorcycle("MNO456", "Jim Doe", true);

        System.out.println("Car Information:");
        car.displayInfo();
        System.out.println();

        System.out.println("Truck Information:");
        truck.displayInfo();
        System.out.println();

        System.out.println("Motorcycle Information:");
        motorcycle.displayInfo();
    }
}
