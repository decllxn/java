package Cornerstones_of_OOP.Encapsulation;

public class Producttest {
    public static void main(String[] args) {
        Product phone = new Product("Iphone 11", 330.50, 354685);
        System.out.println(phone.getPrice());
        System.out.println(phone.getProductName());
        System.out.println(phone.getID());

        phone.increasePriceBy(120.04);
        System.out.println(phone.getPrice());

        phone.decreasePriceBy(40);
        System.out.println(phone.getPrice());
    }
}
