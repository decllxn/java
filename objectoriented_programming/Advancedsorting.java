public class Advancedsorting {
// How to sort lists with objects in them
// To sort objects you need to specify a rule that decides how objects should be sorted
// This rule is called a comparator
// A comparator is a function that takes two objects and returns a number
// The comparator and comparable interfaces allow you to specify what rule is to be used to sort objects
class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        // Compare the objects
        if (a.year < b.year) return -1;
        if (a.year > b.year) return 1;
        return 0;
    }
}
    public static void main(String[] args) {
        // Create a list of objects
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);
    }
}
