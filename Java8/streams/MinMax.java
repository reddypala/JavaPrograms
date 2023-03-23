package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long count = numbersList.stream().filter(i -> i % 2 == 0).count();
        System.out.println("Number of even numbers:" + count);
        numbersList.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        // min()

        Optional<Integer> minimumVlaue = numbersList.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(minimumVlaue.get());

        // max

        Optional<Integer> maximumNumber = numbersList.stream().max((val1, val2) -> {
            return val1.compareTo(val2);
        });

        System.out.println(maximumNumber.get());

         
    }
}
