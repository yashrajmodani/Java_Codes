package day8.toyShop;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Store {
    public List<Toy> initializeToyList() {
        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy(5464, "aaa", 500, "Electronic Learning", 5, LocalDate.of(2022, 5, 10)));
        toyList.add(new Toy(5, "bbb", 1000, "Kitchen and Food", 2, LocalDate.of(2021, 3, 15)));
        toyList.add(new Toy(6, "ccc", 200, "Musical Instruments", 12, LocalDate.of(2024, 1, 20)));
        toyList.add(new Toy(7, "ddd", 20, "Other Toy", 1, LocalDate.of(2020, 6, 5)));
        toyList.add(new Toy(544, "aa", 550, "Electronic Learning", 5, LocalDate.of(2022, 5, 10)));
        toyList.add(new Toy(50, "bb", 900, "Kitchen and Food", 2, LocalDate.of(2021, 3, 15)));
        toyList.add(new Toy(63, "cc", 250, "Musical Instruments", 12, LocalDate.of(2024, 1, 20)));
        toyList.add(new Toy(79, "dd", 21, "Other Toy", 5, LocalDate.of(2020, 6, 5)));

        return toyList;
    }

    public static void main(String[] args) {
        Store s = new Store();
        Stock stock = new Stock();
        List<Toy> toy = s.initializeToyList();
//        Stream<Toy> stream = toy.stream();
//        stream.forEach(System.out::println);
        System.out.println("+++++++++++++LISTING STOCK+++++++++++++++++++++");
        stock.stockList(toy);


        System.out.println("=============FILTERING BY CATEGORY=================");
        stock.filterToysByCat(toy, "Learning");

        System.out.println("=============FILTERING BY PriceRange=================");
        stock.sortPriceCat(toy);

        System.out.println("=============LIST OF OLD STOCK=================");
        stock.listOldStock(toy);

        System.out.println("=============Category count=================");
        stock.countCat(toy);

        System.out.println("=============Least EXPENSIVE TOY Price=================");
        stock.minPrice(toy);

        System.out.println("=============Most EXPENSIVE TOY Price=================");
        stock.maxPrice(toy);

        System.out.println("=============Toys for each Group By AGE=================");
        stock.ageGroup(toy);




    }
}
