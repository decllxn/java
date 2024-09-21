package Scanner.exercises;

import java.util.Scanner;

public class InputForm {
    public static void main(String[] args) {
        Scanner myForm = new Scanner(System.in);
        String name = "";
        String email = "";
        String phone = "";
        int age = 0;

        // Get name
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = myForm.nextLine();
        }

        // Getting the age
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter your age: ");
            try {
                age = Integer.parseInt(myForm.nextLine());
                validAge = true; // Valid input
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid age.");
            }
        }

        // Get email
        while (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
            System.out.print("Enter your email: ");
            email = myForm.nextLine();
            if (!email.contains("@") || !email.contains(".")) {
                System.out.println("Invalid email. Please enter a valid email.");
            }
        }

        // Get phone number
        while (!phone.matches("\\d{10}")) { // Ensures it's 10 digits
            System.out.print("Enter your phone number (10 digits): ");
            phone = myForm.nextLine();
            if (!phone.matches("\\d{10}")) {
                System.out.println("Invalid phone number. Enter again.");
            }
        }

        // Display user details
        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);

        myForm.close();
    }
}
