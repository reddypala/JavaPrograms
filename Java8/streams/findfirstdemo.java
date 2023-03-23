package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findfirstdemo {
    public static void main(String[] args) {
        List<String> stringslList = Arrays.asList("one", "two", "three", "four", "one");
        // findany
        Optional<String> ele = stringslList.stream().findAny();
        System.out.println(ele.get());

        // findfirst
        Optional<String> ele1 = stringslList.stream().findFirst();
        System.out.println(ele1.get());
    }
}
