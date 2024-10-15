package day6.assignment2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stock{
    //Listing the stock
    public void stockList(List<Toy> toyList){
        for(Toy t: toyList){
            System.out.println(t);
        }
    }
    //Filtering Stock.
    public List<Toy> filterToys(List<Toy> toyList,String criteria)
    {
        List<Toy> filtered = new ArrayList<>();
        for(Toy t : toyList)
        {
            if(t.getCategory().contains(criteria))
                filtered.add(t);
        }
        return filtered;
    }

    //List Price Range
    public void priceRange(List<Toy> toyList, double price){
        for(Toy t: toyList){
            if (t.getPrice() >= price){
                System.out.println(t);
            }
        }
    }

    //List Specific age
    public void ageList(List<Toy> toyList, int age){
        for(Toy t: toyList){
            if(t.getAge() >= age){
                System.out.println(t);
            }
        }
    }

    public void listOldStock(List<Toy> toyList) {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        List<Toy> oldStock = toyList.stream()
                .filter(toy -> toy.getPurchaseDate().isBefore(oneYearAgo))
                .collect(Collectors.toList());
        oldStock.forEach(System.out::println);
    }


    // Group by category
    public static Map<String, List<String>> groupByCategory(List<Toy> toyList) {
        Map<String, List<String>> groupedToys = new HashMap<>();

        for (Toy toy : toyList) {
            for (String category : toy.getCategory()) {
                // If the category doesn't exist in the map, create a new list
                groupedToys.computeIfAbsent(category, k -> new ArrayList<>()).add(toy.getName());
            }
        }

        return groupedToys;
    }

}


