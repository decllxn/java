package Scanner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFromPathExample {
    public static void main(String[] args) {
        try {
            // Create a Path object representing the file
            Path path = Path.of("example.txt");
            
            // Create a Scanner to read from the file at the given path
            Scanner scanner = new Scanner(Files.newBufferedReader(path));

            // Read and print the content of the file
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
