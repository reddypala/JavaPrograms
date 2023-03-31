package strings;

import java.util.HashSet;
import java.util.Set;

public class removexyz {
    public static void main(String[] args) {
        String s = "USAXYZINDIAXYZ";

        String[] arr = s.split("XYZ");
        // for (String s1 : arr) {
        // System.out.println(s1);
        // }

        Set<String> uniqueWords = new HashSet<>();
        for (String s1 : arr) {
            uniqueWords.add(s1);
        }

        for (String uq : uniqueWords) {
            System.out.println(uq);
        }

    }
}
