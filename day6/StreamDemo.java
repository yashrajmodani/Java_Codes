package day6;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        int [] nums = {10, 80, 88, 23, 69, 12, 25, 54, 44, 63, 96, 32, 25, 54, 44};

        IntStream stream = Arrays.stream(nums);
        System.out.println(stream.count());

        stream = Arrays.stream(nums);
        System.out.println(stream.distinct().count());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        stream.distinct().sorted().forEach((n) -> System.out.println(n));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        stream.distinct().sorted().forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        List<Integer> squares = stream.map((n) -> n*n).boxed().toList();
        System.out.println(squares);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        List<Integer> even = stream.filter((n) -> n%2 ==0).boxed().toList();
        System.out.println(even);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        OptionalInt min = stream.min();
        if(min.isPresent())
            System.out.println(min.getAsInt());


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        OptionalInt max = stream.max();
        if(max.isPresent())
            System.out.println(max.getAsInt());


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        OptionalDouble avg = stream.average();
        if(avg.isPresent())
            System.out.println(avg.getAsDouble());


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        OptionalInt total = stream.reduce((n1, n2) -> n1*n2);
        if(total.isPresent())
            System.out.println(total.getAsInt());



        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        stream = Arrays.stream(nums);
        long totalval = stream.reduce(1,(n1, n2) -> n1*n2);
        System.out.println(totalval);
    }
}
