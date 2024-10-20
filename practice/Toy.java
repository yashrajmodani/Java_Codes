package practice;

import java.time.LocalDate;
import java.util.Set;

public class Toy {
    private int product_id;
    private String name;
    private double price;
    private Set<String> category;
    private int age;
    LocalDate purchase_date;


    public Toy(int product_id, String name, double price, Set<String> category, int age, LocalDate purchase_date) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.age = age;
        this.purchase_date = purchase_date;
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

    public Set<String> getCategory() {
        return category;
    }

    public void setCategory(Set<String> category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(LocalDate purchase_date) {
        this.purchase_date = purchase_date;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                ", purchase_date=" + purchase_date +
                '}';
    }
}
