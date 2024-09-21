package Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner to read from standard input(Key board)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and read input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        scanner.close();
    }
}
