package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Mapdemo3 {
    public static void main(String[] args) {
        // Requirement: read every element from the collection and multiply by 3 and
        // store it
        // some other collection.
        List<Integer> numbeList = Arrays.asList(2, 3, 4, 5);
        List<Integer> multipliedList = new ArrayList<>();

        // without using collections
        for (int integer : numbeList) {
            System.out.println(integer * 3);
            multipliedList.add(integer * 3);
        }
        System.out.println(multipliedList);

        // using streams
        numbeList.stream().map(num -> num * 3).forEach(System.out::println);
        multipliedList = numbeList.stream().map(num -> num * 3).collect(Collectors.toList());
        System.out.println(multipliedList);
    }
}
