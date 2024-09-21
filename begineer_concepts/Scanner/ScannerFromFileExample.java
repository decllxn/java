package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFileExample {
    public static void main(String[] args) {
        try {
            // Create a file object
            File myfile = new File("example.txt");

            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(myfile);

            // Read and print the content of the file
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
