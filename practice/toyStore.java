package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class toyStore {
    public List<Toy> initializeData(){
        List<Toy> toyList = new ArrayList<>();

        Set<String> category = new TreeSet<>();
        category.add("Kitchen");
        category.add("Learning");
        toyList.add(new Toy(1, "aaa", 350, category, 5, LocalDate.of(2024, 12, 5)));

        Set<String> category1 = new TreeSet<>();
        category1.add("Electronic");
        category1.add("Other Toy");
        toyList.add(new Toy(2, "bbb", 400, category1, 3, LocalDate.of(2022, 5, 8)));

        Set<String> category2 = new TreeSet<>();
        category2.add("Electronic");
        category2.add("Kitchen");
        toyList.add(new Toy(3, "ccc", 500, category2, 3, LocalDate.of(2021, 6, 9)));

        return toyList;
    }
}
