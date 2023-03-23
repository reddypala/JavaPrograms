package streams;

import java.util.HashSet;
import java.util.Set;

//anyMatch
//allMatch
//noneMatch
public class MatchDemo1 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("one apple");
        fruits.add("one mango");
        fruits.add("two apples");
        fruits.add("more grapes");
        fruits.add("Two guavas");

        boolean result = fruits.stream().anyMatch(value -> {
            return value.startsWith("one");
        });
        System.out.println(result);

        //allMatch
        boolean result1 = fruits.stream().allMatch(value -> {
            return value.startsWith("one");
        });

        System.out.println(result1);
        boolean result2 = fruits.stream().noneMatch(value -> {
            return value.startsWith("one");
        });

        System.out.println(result2);

    }
}
