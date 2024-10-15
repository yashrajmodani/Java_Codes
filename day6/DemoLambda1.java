package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambda1 {
    public boolean operateOnNum(Predicate p, int n){
        return p.test(n);
    }
    public List<Integer>  operateOnNum(Predicate p, List<Integer> n){
        List<Integer> filtered = new ArrayList<>();
        for(Integer i: n){
            if(p.test(i)){
                filtered.add(i);
            }
        }
        return filtered;
    }

    public static void main(String[] args) {
        Integer[] nums = {12, -13, -14, 15, 16, 17};
        List<Integer> vals = Arrays.asList(nums);
        DemoLambda1 demo = new DemoLambda1();
        boolean isPositive = demo.operateOnNum((n) -> n>0, 12);
        System.out.println(isPositive);

        List<Integer> positives = demo.operateOnNum((n) -> n>0, vals);
        System.out.println(positives);

        Integer[] nums2 = {100, 150, 175, 200, 600, 700, 777, 169, 550, 510, 500};
        List<Integer> vals2 = Arrays.asList(nums2);
        List<Integer> mul_100 = demo.operateOnNum((n) -> n%100 == 0, vals2);
        System.out.println(mul_100);

    }
}
