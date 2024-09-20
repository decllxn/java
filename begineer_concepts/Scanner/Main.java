package Scanner;

import java.util.Scanner;

class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in); // Create a scanner object
        System.out.print("Enter your name: ");

        String userName = inputObject.nextLine(); // Read user Input
        System.out.println("Hello, " + userName + "!"); // Output user input
    }
}
