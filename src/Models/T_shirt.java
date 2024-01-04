package Models;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T_shirt {
    String name;

    int product_code;

    double price;

    String brand_name;

    String description;

    String[] sizes;

    public T_shirt(String name, int product_code, double price, String brand_name, String description, String[] sizes) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand_name = brand_name;
        this.description = description;
        this.sizes = sizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    public void display_tshirt(){
        String item_name = this.name;
        String description = this.description;
        int product_code = this.product_code;
        String brand = this.brand_name;
        double price = this.price;
        String[] sizes = this.sizes;

        System.out.println("Item Name:"+" "+ item_name);
        System.out.println("Description:"+" "+description);
        System.out.println("Product Code:"+" "+product_code);
        System.out.println("Brand:"+" "+brand);
        System.out.println("Sizes: " + Arrays.toString(sizes));
        System.out.println();
    }
}
