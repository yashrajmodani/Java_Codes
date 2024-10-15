package day6.assignment2;

import java.time.LocalDate;
import java.util.*;

public class Store {
    public List<Toy> initializeToyList() {
        List<Toy> toyList = new ArrayList<>();
        Set<String> category1 = new TreeSet<>();
        category1.add("Electronic Learning");
        category1.add("Bath Toys");
        toyList.add(new Toy(5464, "aaa", 7500, category1, 5, LocalDate.of(2022, 5, 10)));
        Set<String> category2 = new TreeSet<>();
        category2.add("Kitchen and Food");
        category2.add("Learning");
        toyList.add(new Toy(5, "bbb", 10000, category2, 2, LocalDate.of(2021, 3, 15)));
        Set<String> category3 = new TreeSet<>();
        category3.add("Musical Instruments");
        category3.add("Kitchen and Food");
        toyList.add(new Toy(6, "ccc", 75000, category3, 12, LocalDate.of(2024, 1, 20)));
        Set<String> category4 = new TreeSet<>();
        category4.add("Electronic Learning");
        category4.add("Other Toy");
        toyList.add(new Toy(7, "ddd", 20, category4, 1, LocalDate.of(2020, 6, 5)));

        return toyList;
    }

    public static void main(String[] args) {

        Store s = new Store();
        Stock stock = new Stock();
        List<Toy> toyList = s.initializeToyList();
        //List the Stock.
        stock.stockList(toyList);

        //Filter Stock based on category.
        System.out.println("\n========Toys filtered by Category=============");
        List<Toy> filteredToyList = stock.filterToys(toyList, "Kitchen and Food");
        stock.stockList(filteredToyList);

        //Binary Search based on PRODUCT ID
        System.out.println("\n++++++++++++++++++++++++++++++Search toy List using Binary Search++++++++++++++++++++++++++++++++++++");
        int index = Collections.binarySearch(toyList, new Toy(6, null, 0, null, 0, null));
        System.out.println("Found at index: " + index);

        //List Of Toys based on Price range
        System.out.println("\n+++++++++++List Of Toys based on Price range+++++++++++++++++++++++");
        stock.priceRange(toyList, 750);

        //List Of Toys based on Age
        System.out.println("\n+++++++++++List Of Toys based on Age Range+++++++++++++++++++++++");
        stock.ageList(toyList, 3);


        //Sort Toy based on Price Range in Ascending Order
        System.out.println("\n=============SORT by PRODUCT PRICE in Ascending Order==============\n");
        toyList.sort(new PriceComparator());
        stock.stockList(toyList);


        //Sort Toy based on Price Range in Ascending Order
        System.out.println("\n=============SORT by PRODUCT ID in Ascending Order==============\n");
        toyList.sort(new ProductIdComparator());
        stock.stockList(toyList);

        // List old stock
        System.out.println("\nOld stock (older than 1 year):");
        stock.listOldStock(toyList);

        // Group by category
        System.out.println("\nGrouping toys by category:");
        System.out.println(Stock.groupByCategory(toyList));
    }
}

    /*Toy name=aaa, price=7500.0, category=[Bath Toys, Electronic Learning]
Toy name=bbb, price=10000.0, category=[Kitchen and Food, Learning]
Toy name=ccc, price=75000.0, category=[Kitchen and Food, Musical Instruments]
Toy name=ddd, price=20.0, category=[Electronic Learning, Other Toy]

========Toys filtered by Category=============
Toy name=bbb, price=10000.0, category=[Kitchen and Food, Learning]
Toy name=ccc, price=75000.0, category=[Kitchen and Food, Musical Instruments]

++++++++++++++++++++++++++++++Search toy List using Binary Search++++++++++++++++++++++++++++++++++++
Found at index: 2

+++++++++++List Of Toys based on Price range+++++++++++++++++++++++
Toy name=aaa, price=7500.0, category=[Bath Toys, Electronic Learning]
Toy name=bbb, price=10000.0, category=[Kitchen and Food, Learning]
Toy name=ccc, price=75000.0, category=[Kitchen and Food, Musical Instruments]

+++++++++++List Of Toys based on Age Range+++++++++++++++++++++++
Toy name=aaa, price=7500.0, category=[Bath Toys, Electronic Learning]
Toy name=ccc, price=75000.0, category=[Kitchen and Food, Musical Instruments]

=============SORT by PRODUCT PRICE in Ascending Order==============

Toy name=ddd, price=20.0, category=[Electronic Learning, Other Toy]
Toy name=aaa, price=7500.0, category=[Bath Toys, Electronic Learning]
Toy name=bbb, price=10000.0, category=[Kitchen and Food, Learning]
Toy name=ccc, price=75000.0, category=[Kitchen and Food, Musical Instruments]

=============SORT by PRODUCT ID in Ascending Order==============

Toy name=bbb, price=10000.0, category=[Kitchen and Food, Learning]
Toy name=ccc, price=75000.0, category=[Kitchen and Food, Musical Instruments]
Toy name=ddd, price=20.0, category=[Electronic Learning, Other Toy]
Toy name=aaa, price=7500.0, category=[Bath Toys, Electronic Learning]

Old stock (older than 1 year):
Toy name=bbb, price=10000.0, category=[Kitchen and Food, Learning]
Toy name=ddd, price=20.0, category=[Electronic Learning, Other Toy]
Toy name=aaa, price=7500.0, category=[Bath Toys, Electronic Learning]

Grouping toys by category:
{Other Toy=[ddd], Learning=[bbb], Kitchen and Food=[bbb, ccc], Electronic Learning=[ddd, aaa], Musical Instruments=[ccc], Bath Toys=[aaa]}*/


