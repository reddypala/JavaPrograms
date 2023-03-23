package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** filter with multiple conditions. */
public class filterdemo2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Melisandre", "sansa", "jon", "Daenerys", "Joffery");
        List<String> longNames = new ArrayList<>();

        longNames = names.stream().filter(str -> str.length() > 6 && str.length() < 8).collect(Collectors.toList());
        System.out.println(longNames);

        names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(System.out::println);
    }
}
