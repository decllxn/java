package Cornerstones_of_OOP.Encapsulation;

public class Product {
    private String productName;
    private double price;
    private int PRODUCT_ID;

    // Constructor to initialize variables
    public Product (String productName, double price, int PRODUCT_ID) {
        this.productName = productName;
        this.price = price;
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getID() {
        return PRODUCT_ID;
    }

    public void increasePriceBy (double amount) {
        price += amount;

        System.out.println(
            "The Price of this product has increased by "
            + amount + 
            ". It now costs " + price
        );
    }

    public void decreasePriceBy (double amount) {
        if (price - amount > 0) {
            price -= amount;

            System.out.println(
            "The Price of this product has increased by "
            + amount + 
            ". It now costs " + price
            );
        }
        else {
            System.out.println("Invalid amount");
        }
    }
}
