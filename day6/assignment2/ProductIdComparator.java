package day6.assignment2;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2){
        if (o1.getProduct_id() < o2.getProduct_id())
            return -1;
        else return 1;
    }
}
