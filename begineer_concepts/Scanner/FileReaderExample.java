package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            // Creating a File object for the file that needs to be read
            // I don't know why java can't find the file
            File file = new File("example.txt");

            Scanner readMyFile = new Scanner(file);

            // Read the file line by line
            while (readMyFile.hasNextLine()) {
                String line = readMyFile.nextLine();
                System.out.println(line);
            }

            // Close the scanner
            readMyFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
