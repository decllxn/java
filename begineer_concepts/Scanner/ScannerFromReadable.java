package Scanner;

import java.io.StringReader;
import java.util.Scanner;

public class ScannerFromReadable {
    public static void main(String[] args) {

        // Create a StringReader (implements Readable) as the source
        StringReader myString = new StringReader("Java Scanner example.");

        // Create a Scanner to read from the StringReader
        Scanner scanner = new Scanner(myString);

        // Read and print tokens from the readable source
        while (scanner.hasNextLine())  {
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}
