import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueId;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueId) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueId = uniqueId;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + (telephoneNumber.isEmpty() ? "N/A" : telephoneNumber));
        System.out.println("Mobile Number: " + (mobileNumber.isEmpty() ? "N/A" : mobileNumber));
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueId);
    }
}

public class Directory {
    private List<Person> people;

    public Directory() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void displayDirectory() {
        for (Person person : people) {
            person.displayInfo();
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people to add to the directory: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Telephone Number (if available, otherwise leave blank): ");
            String telephoneNumber = scanner.nextLine();

            System.out.print("Mobile Number (if available, otherwise leave blank): ");
            String mobileNumber = scanner.nextLine();

            System.out.print("Head of Family: ");
            String headOfFamily = scanner.nextLine();

            System.out.print("Unique ID No.: ");
            String uniqueId = scanner.nextLine();

            Person person = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueId);
            directory.addPerson(person);
        }

        System.out.println("\nDirectory Information:");
        System.out.println("=======================");
        directory.displayDirectory();

        scanner.close();
    }
}
