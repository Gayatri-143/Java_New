import java.io.*;
import java.util.Scanner;

public class StudentInfoIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "student.dat";

        // Accepting user input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        // Writing to file using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);
            System.out.println("\nStudent data saved successfully to '" + fileName + "'.\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from file using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Reading student data from file:");
            System.out.println("Name: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readDouble() + " kg");
            System.out.println("Height: " + dis.readDouble() + " cm");
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone: " + dis.readUTF());
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}
