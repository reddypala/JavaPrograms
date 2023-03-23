package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("A", "B", "C", "D", "1", "2", "3");

        Optional<String> reduced = stringsList.stream().reduce((value, combinedValue) -> {
            return combinedValue + value;
        });

        System.out.println(reduced.get());
    }
}
