package day4.candyStore;

import java.util.Scanner;


public class Store {
    public static void main(String[] args) {
        Cart cart = new Cart();

        System.out.println("Welcome to Aladdin Dessert Store : ");

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Choice \n1.Candie (per/kg)\n2.Cookies (per/dozen)\n3.Ice Cream (per piece)");
            int choice = sc.nextInt();
            System.out.println("Enter Price: ");
            double price = sc.nextDouble();
            System.out.println("Enter Quantity :");
            double qty = sc.nextDouble();

            switch(choice){
                case 1:
                    System.out.println("You have selected Candy");
                    System.out.println("Your qty is: " + qty);
                    Candy c = new Candy("candy", qty, price);
                    cart.addToCart(c);
                    break;

                case 2:
                    System.out.println("You have selected Cookies");
                    System.out.println("Your qty is: " + qty);
                    Cookies cookie = new Cookies("cookie", qty, price);
                    cart.addToCart(cookie);
                    break;

                case 3:
                    System.out.println("You have selected IceCream");
                    System.out.println("Your qty is: " + qty);
                    IceCream ice = new IceCream("IceCreams", qty, price);
                    cart.addToCart(ice);
                    break;

            }
            System.out.println("Do you want to buy More items: 'y' or 'n'");
            String con = sc.next();
            if (con.equals("n")){
                System.out.println("Thank you for coming :)");
                System.out.println("Your total items are: "+ Cart.item + ". \nYour total bill is: "+ Cart.total);
                break;
            }



        }

    }
}
