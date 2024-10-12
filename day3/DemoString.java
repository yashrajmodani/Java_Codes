package day3;

public class DemoString {
    public static void main(String[] args) {
        String s = "Java";
        String s1 = "aJva";

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

//        s = s + " 11";
//        System.out.println(s.hashCode());
        if(s == s1)
            System.out.println("1. Strings are equal");
        else
            System.out.println("Not equal");

        String n1 = new String("hello");
        String n2 = new String("Hello");

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        if(n1 == n2)
            System.out.println("2.  Strings are equal");
        else
            System.out.println("Not equal");

        if(n1.equalsIgnoreCase(n2))
            System.out.println("3. Strings are equal");
        else
            System.out.println("Not equal");

//        System.out.println(n1 + n2);
//        n1 = n1.concat(" World");
//        System.out.println(n1);

    }
}
