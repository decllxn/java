package Hashmaps;

import java.util.HashMap;

public class MoreMethods {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Tanzania", "Dodoma");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("UK", "London");
        capitalCities.put("Australia", "Canberra");

        // .merge() method creates an entry with a specific key and value
        // If an entry with the specified key already exists, calculates a new value for the entry
        capitalCities.merge("Canada", "Ottawa", (a, b) -> a + " -> " + b);
        capitalCities.merge("Germany", "Berlin", (a, b) -> a + " -> " + b);
        System.out.println(capitalCities);
    }    
}
