package day2;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Flavour flavour = Flavour.CHOCOLATE;

        switch(flavour){
            case CHOCOLATE:
                System.out.println("You have selected: " + flavour);
                System.out.println("Price for selected flavour: " +flavour.getPrice());

                break;
            case MINT:
                System.out.println("You have selected: " + flavour);

                break;
            case CREAM:
                System.out.println("You have selected: " + flavour);
                break;
        }




        System.out.println("**********MENU***********");
        Flavour[] menu = Flavour.values();
        for(Flavour m: menu)
        {
            System.out.println(m);
        }
        System.out.println("Enter the flavour: Chocolate/Mint/Cream");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        //To create an enum object from string
        Flavour f = Flavour.valueOf(choice.toUpperCase());
        System.out.println("Selected Flavours: " + f);
        System.out.println("Price for selected flavour: " +f.getPrice());
    }
}
