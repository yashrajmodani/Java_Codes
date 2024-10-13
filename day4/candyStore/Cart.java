package day4.candyStore;

public class Cart {
    public static double total;
    public static int item;
    public double addToCart(Dessert d){
        total += d.calculatePrice();
        item += 1;
        System.out.println("You bought: "+ item+ " item's and Your bill is: " + total);
        return total;


    }
}
