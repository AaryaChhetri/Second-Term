package Models;

// Order class
import java.util.Arrays;

public class Order {
    // Fields
    String name;
    long phoneNumber;
    int[] items;
    double[] price;

    // Constructor
    public Order(String name, long phoneNumber, int[] items, double[] price) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public double[] getPrice() {
        return price;
    }

    public void setPrice(double[] price) {
        this.price = price;
    }

    // Method to print the bill with VAT and total price
    public void generateBill() {
        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Price: " + Arrays.toString(price));


        double totalPrice = 0;

        for (int i = 0; i < price.length; i++) {
            totalPrice += price[i];
        }


        double vat = 0.13 * totalPrice;

        System.out.println("Total Price (including VAT 13%): " + "Rs"+(totalPrice + vat));
        System.out.println();
    }
}
