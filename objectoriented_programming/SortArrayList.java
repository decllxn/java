import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

// Creating a comparator
class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        // Compare the year of both objects
        if (a.year < b.year) return -1;
        if (a.year > b.year) return 1;
        return 0;
    }
}

public class SortArrayList {
    public static void main (String[] args) {
        // Create an ArrayList of Car objects
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("Toyota", "Camry", 2015));
        myCars.add(new Car("BMW", "M5", 2022));
        myCars.add(new Car("Honda", "Civic", 2018));

        // Use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}
