package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterdemo1 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> evenNumList = new ArrayList<>();

        // without using streams print even numbers from list and add it to evenNumList.
        for (int n : numbersList) {
            if (n % 2 == 0) {
                evenNumList.add(n);
            }
        }
        System.out.println(evenNumList);

        // using streams print even numbers from list and add it to evenNumList.
        System.out.println("printing even numbers from list and added it to evenNumList using streams:");
        evenNumList = numbersList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumList);

        numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        //or
        numbersList.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
