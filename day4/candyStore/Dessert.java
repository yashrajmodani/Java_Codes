package day4.candyStore;

public abstract class Dessert {
    protected String product;
    protected double price;


    public Dessert (String product, double price){
        this.product = product;
        this.price = price;

    }
    public abstract double calculatePrice();

    public String toString(){
        return "Desert: " + this.product + this.price;
    }
}
