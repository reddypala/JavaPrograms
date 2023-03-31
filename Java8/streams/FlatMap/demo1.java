package Java8.streams.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class demo1 {
    public static void main(String[] args) {
        // map
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> list2 = list1.stream().map(n -> n + 5).collect(Collectors.toList());

        System.out.println(list2);

        //flatmap
        // 1.say we have three collections
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);

        // 2.Now add the above three collections into one single collection.
        List<List<Integer>> finalList_collection = Arrays.asList(lst1,lst2,lst3);

       List<Integer> final_List= finalList_collection.stream().flatMap(x ->x.stream()).collect(Collectors.toList());
        System.out.println(final_List);

    }
}
