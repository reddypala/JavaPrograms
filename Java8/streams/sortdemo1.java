package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortdemo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        // reverseOrder sorting or descending order
        List<Integer> revSortedList = list1.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(revSortedList);

        // string sorting
        List<String> list2 = Arrays.asList("John", "Mary", "Kim", "David", "Smith");

        List<String> sortedStringList = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStringList);

        List<String> revOrder = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());    
        System.out.println(revOrder);
    }
}
