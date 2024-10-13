package day4.candyStore;

public class Candy extends Dessert {
    protected double qty;

    public Candy(String name, double price, double qty){
        super(name,price);
        this.qty = qty;
    }

    public double calculatePrice(){
        return price * (qty/1000);

    }
}
