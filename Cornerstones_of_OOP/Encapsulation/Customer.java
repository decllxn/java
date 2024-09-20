package Cornerstones_of_OOP.Encapsulation;

public class Customer {
    public static void main(String[] args) {
        // Create some items
        Item phone = new Item("Iphone 11", 999.99, 5);
        Item laptop = new Item("Dell Inspiron", 1200.00, 3);
        Item headphones = new Item("Sony Headphones", 199.99, 10);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem(phone, 2); // Adding 2 phones
        cart.addItem(laptop, 1); // Adding 1 laptop
        cart.addItem(headphones, 5); // Adding 5 headphones

        // View cart
        cart.viewCart();

        // Remove items from the cart
        cart.removeItem(headphones, 2); // Removing 2 headphones
        cart.viewCart(); // View cart after removing items

        // Display total cost
        System.out.println("Total cost: $" + cart.getTotalCost());

        // Clear cart
        cart.clearCart();
        cart.viewCart();
    }
}
