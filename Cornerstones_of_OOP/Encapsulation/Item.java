package Cornerstones_of_OOP.Encapsulation;

public class Item {
    private String name;
    double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItems (int number) {
        if (number > 0) {
            quantity += number;
            System.out.println(number + " items added. Total quantity: " + quantity);
        }
        System.out.println("Invalid number of items to add");
    }

    public void removeItems (int number) {
        if (number > 0 && quantity > number) {
            quantity -= number;
            System.out.println(number + " items removed. Remaining quantity: " + quantity);
        }
        System.out.println("Failed to remove items");
    }

    public String getItemname() {
        return name;
    }

    public double getItemprice() {
        return price;
    }

    public int getItemNumber() {
        return quantity;
    }
}
