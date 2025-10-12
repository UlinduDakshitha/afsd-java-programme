import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        while(age > 100) {
            System.out.print("Enter your correct age: ");
            age = sc.nextInt();
        }

        // Consume the leftover newline character
        sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine(); // Use nextLine() for multi-word input

        System.out.print("Enter your telephone number: ");
        int phoneNumber = sc.nextInt();

        // Display the collected information
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Telephone: " + phoneNumber);

    }
}
