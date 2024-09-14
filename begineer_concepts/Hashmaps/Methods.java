package Hashmaps;

import java.util.HashMap;

public class Methods {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Scotland", "Edinburgh");
        capitalCities.put("Wales", "Cardiff");
        capitalCities.put("Northern Ireland", "Belfast");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");

        capitalCities.replaceAll((k, v) -> "The capital of " + k + " is " + v);

        System.out.println(capitalCities);
        // The replaceAll() method replaces the value of every entry in the map.
        // With the result of an operation using the entry's key and value.
        // The operation can be defined by a lambda expression that is compatible with the apply() method of Java's Bifunction interface
        // The lambda expression takes two parameters, the key and the value of the entry.


        // putIfAbsent - Add new entries only if they don't exist
        capitalCities.putIfAbsent("Spain", "Madrid");
        capitalCities.putIfAbsent("Kenya", "Nairobi");
        // The putIfAbsent() method writes an entry into the map
        // If an entry with the same key already exixts and it's value is not null, then the map is not changed
        System.out.println(capitalCities);


        // .replace() - Method writes a new value to an existing entry in the map
        // The entry can be specified by it's key, or by both it's key and value
        capitalCities.replace("Spain", "Barcelona");
        capitalCities.replace("France", "Paris", "Lyon");

        System.out.println(capitalCities);


        // putAll() - This method writes all of the entries from another map into the map
        // If entries exist with the same keys then the values of these entries will be changed
        HashMap<String, String> moreCities = new HashMap<String, String>();
        moreCities.put("Italy", "Rome");
        moreCities.put("Greece", "Athens");
        capitalCities.putAll(moreCities);
        System.out.println(capitalCities);
    }    
 }
