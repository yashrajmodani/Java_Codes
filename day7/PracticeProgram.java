package day7;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class PracticeProgram {
    public static void main(String[] args) {
        String [] fruits = {"Mango", "orange","Grapes","apple", "Banana", "strawberrry","Watermelon"};


//        liest of fruits in upper case and lower case
        List<String> lst = Arrays.asList(fruits);
        Stream<String> stream = lst.stream();

        List<String> upper = stream.map((n) -> n.toUpperCase()).toList();
        System.out.println(upper);


        stream = lst.stream();
        List<String> lower = stream.map((n) -> n.toLowerCase()).toList();
        System.out.println(lower);

        // fruits less than n ascending order

        stream = lst.stream();
        List<String> lessThanN = stream.filter((n) -> n.compareToIgnoreCase("n")<0).sorted(String::compareToIgnoreCase).toList();
        System.out.println(lessThanN);


        // fruits less than n descending order
        stream = lst.stream();
        List<String> lessThanB = stream.filter((n) -> n.compareToIgnoreCase("n")<0).sorted(String::compareToIgnoreCase).toList().reversed();
        System.out.println(lessThanB);


//        CREATE a list with upper case name only;

        stream = lst.stream();
        List<String> upperCase = stream.filter(n -> Character.isUpperCase(n.charAt(0))).toList();
        System.out.println(upperCase);



    }
}
