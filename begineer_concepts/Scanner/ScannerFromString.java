package Scanner;

import java.util.Scanner;

public class ScannerFromString {
    public static void main(String[] args) {
        // Create a Scaner to read from a string
        String input = "Hello World! 123 456";
        Scanner string = new Scanner(input);
        
        // Read and print tokens from the string
        while (string.hasNext()) {
            System.out.println(string.next());
        }

        // .nextLine() reads line by line
        // .next() reads word by word

        string.close();
    }    
}
