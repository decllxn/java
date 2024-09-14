package Hashmaps;
import java.util.HashMap; // Importing HashMap class

public class Intro {
// A hashmap stores items in "key/value " pairs
// You can access them by an index of another type(e.g a String)
    public static void main(String[] args) {
        // Creating a HashMap object called capitalcities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("Spain", "Madrid");
        capitalCities.put("USA", "Washington");
        capitalCities.put("China", "Beijing");
        capitalCities.put("Japan", "Tokyo");
        System.out.println(capitalCities);


        // Access an item
        // To access a value in the HashMap, use the get() method and refer to it's key
        String MyCapitalCity = capitalCities.get("Spain");
        System.out.println("My capital city is " + MyCapitalCity);
        // When a key doesn't exist the .get() method returns null

        // Remove an Item
        // To remove an item, use the remove() method and refer to the key
        capitalCities.remove("France");
        System.out.println(capitalCities);

        // capitalCities.clear(); // Removes all items

        // HashMap Size
        // To find out how many items there are, use the size() method;
        int myHashMapSize = capitalCities.size();
        System.out.println("Number of items in the HashMap: " + myHashMapSize);
    }
}
