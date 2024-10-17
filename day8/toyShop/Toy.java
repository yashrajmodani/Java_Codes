package day8.toyShop;

import java.time.LocalDate;

public class Toy {
    private int product_id;
    private String name;
    private double price;
    private String category;
    private int age;
    private LocalDate purchaseDate;

    public Toy(int product_id, String name, double price, String category, int age, LocalDate purchaseDate) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.age = age;
        this.purchaseDate = purchaseDate;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Toy name=" + name + ", price=" + price + ", category=" + category;
    }
}