package Cornerstones_of_OOP.Encapsulation;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    // Map to store items and their quantities in the shopping cart
    private Map<Item, Integer> cartItems;
    private double totalCost;

    // Constructor to initialize the shopping cart
    public ShoppingCart() {
        this.cartItems = new HashMap<>();
        this.totalCost = 0.0;
    }

    // Method to add an item to the shopping cart
    public void addItem(Item item, int quantity) {
        if (quantity > 0) {
            cartItems.put(item, cartItems.getOrDefault(item, 0) + quantity);
            totalCost += item.getItemprice() * quantity;
            System.out.println(quantity + " " + item.getItemname() + "(s) added to the cart.");
        } else {
            System.out.println("Invalid quantity. Please add at least one item.");
        }
    }

    // Method to remove an item from the shopping cart
    public void removeItem(Item item, int quantity) {
        if (cartItems.containsKey(item)) {
            int currentQuantity = cartItems.get(item);
            if (quantity > 0 && quantity <= currentQuantity) {
                cartItems.put(item, currentQuantity - quantity);
                totalCost -= item.getItemprice() * quantity;
                System.out.println(quantity + " " + item.getItemname() + "(s) removed from the cart.");
                if (cartItems.get(item) == 0) {
                    cartItems.remove(item);
                }
            } else {
                System.out.println("Invalid quantity or insufficient items in the cart.");
            }
        } else {
            System.out.println("Item not found in the cart.");
        }
    }

    // Method to view all items in the cart
    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Map.Entry<Item, Integer> entry : cartItems.entrySet()) {
                Item item = entry.getKey();
                int quantity = entry.getValue();
                System.out.println(item.getItemname() + " - " + quantity + " unit(s) - $" + item.getItemprice() * quantity);
            }
            System.out.println("Total cost: $" + totalCost);
        }
    }

    // Method to calculate the total cost of items in the cart
    public double getTotalCost() {
        return totalCost;
    }

    // Method to clear the shopping cart
    public void clearCart() {
        cartItems.clear();
        totalCost = 0.0;
        System.out.println("Shopping cart has been cleared.");
    }
}
