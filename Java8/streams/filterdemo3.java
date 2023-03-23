package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * collection with null values. remove the nulls and store the data in the new
 * collection.
 */
public class filterdemo3 {
    public static void main(String[] args) {
        // data with nulls, filter the data and remove nulls
        List<String> words = Arrays.asList("cup", null, "forest", "sky", null, "theatre");

        List<String> results = words.stream().filter(w -> w != null).collect(Collectors.toList());

        System.out.println(results);
    }
}
