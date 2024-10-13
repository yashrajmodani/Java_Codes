package day4.candyStore;

public class IceCream extends Dessert {
    protected double qty;

    public IceCream(String name, double price, double qty){
        super(name,price);
        this.qty = qty;
    }
    public double calculatePrice(){
        return price * qty;

    }

}
