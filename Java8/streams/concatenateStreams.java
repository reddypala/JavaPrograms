package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concatenateStreams {
    public static void main(String[] args) {
        List<String> animalList = Arrays.asList("Dog", "Cat", "Elephant", "Horse", "Lion");
        List<String> BirdList = Arrays.asList("eagle", "peacock", "sparrow", "parrot", "crow");

        Stream<String> stream1 = animalList.stream();
        Stream<String> stream2 = BirdList.stream();

        // concatenate stream1 and stream2
        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());

        System.out.println(finalList);

        for (String item : finalList) {
            System.out.println(item);
        }
    }
}
