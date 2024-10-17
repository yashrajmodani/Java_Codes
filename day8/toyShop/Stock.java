package day8.toyShop;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.max;

public class Stock {
    Stream<Toy> stream;
    public void stockList(List<Toy> toyList){
        stream = toyList.stream();
        stream.forEach(System.out::println);
    }

    //Filtering Stock.
    public void filterToysByCat(List<Toy> toyList, String criteria)
    {
        stream = toyList.stream();
        Predicate<Toy> t = (toy) ->{
            if(toy.getCategory().contains(criteria))
                return true;
            else return false;
        };
        stream.filter(t).forEach((v) -> System.out.println(v));
    }

    public void filterToysByPrice(List<Toy> toyList){
        stream = toyList.stream();
        Predicate<Toy> t = (toy) ->{
            if(toy.getPrice() >= 500 && toy.getPrice() <= 1000)
                return true;
            else return false;
        };
        stream.filter(t).forEach((n) -> System.out.println(n));
    }

    public void sortPriceCat(List<Toy> toyList){
        stream = toyList.stream();
        Comparator<Toy> bycat = Comparator.comparing(Toy::getCategory);
        Comparator<Toy> byprice = Comparator.comparing(Toy::getPrice).thenComparing(bycat);
        stream.sorted(byprice).forEach(System.out::println);
    }
    public void listOldStock(List<Toy> toyList) {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        List<Toy> oldStock = toyList.stream()
                .filter(toy -> toy.getPurchaseDate().isBefore(oneYearAgo))
                .collect(Collectors.toList());
        oldStock.forEach(System.out::println);
    }

    public void countCat(List<Toy> toyList){
        stream = toyList.stream();
        Map<String, List<Toy>> groupByCat = stream.collect(Collectors.groupingBy(Toy::getCategory));
        groupByCat.forEach((k,v) -> System.out.println(k + "," + v.size()));
    }

    public void minPrice(List<Toy> toyList){
        stream = toyList.stream();
        Optional<Toy> min = stream.min(Comparator.comparing(toy -> toy.getPrice()));
        if(min.isPresent())
            System.out.println(min.get());

    }

    public void maxPrice(List<Toy> toyList){
        stream = toyList.stream();
        Optional<Toy> min = stream.max(Comparator.comparing(toy -> toy.getPrice()));
        if(min.isPresent())
            System.out.println(min.get());

    }

    public void ageGroup(List<Toy> toyList){
        stream = toyList.stream();
        Map<Integer, List<Toy>> groupByAge = stream.collect(Collectors.groupingBy(Toy::getAge));
        groupByAge.forEach((k,v) -> System.out.println("for age group of "+ k + ", no. of Toys: " + v.size()));
    }



}
