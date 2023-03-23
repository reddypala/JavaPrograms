package RealTimeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,34,55,78,65,44,88);
        List<Integer> evenList = new ArrayList<>();

        evenList = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
