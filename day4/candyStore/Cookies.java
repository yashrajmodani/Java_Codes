package day4.candyStore;

public class Cookies extends Dessert {
    protected double qty;

    public Cookies(String name, double price, double qty){
        super(name,price);
        this.qty = qty;
    }
    public double calculatePrice(){
        return price * (qty/12);

    }
}
