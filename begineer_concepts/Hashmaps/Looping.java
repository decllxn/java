package Hashmaps;
import java.util.HashMap;

public class Looping {
    // Loop through the items of a HashMap with a for-each loop
    // Use the .keySet() if you want the keys
    // Use the .values() method if you only want the values

    public static void main(String[] args) {
        HashMap<String, String> carModels = new HashMap<String, String>();

        carModels.put("Ford", "Mustang");
        carModels.put("Chevrolet", "Camaro");
        carModels.put("Toyota", "Corolla");
        carModels.put("Honda", "Civic");
        carModels.put("Nissan", "Altima");
        carModels.put("BMW", "3 Series");
        carModels.put("Mercedes", "C-Class");

        // Print keys
        for (String i : carModels.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : carModels.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : carModels.keySet()) {
            System.out.println(i + ": " + carModels.get(i));
        }
    }
}
