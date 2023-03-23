package strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "BRAG";
        String s2 = "RABG";

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if (s1.length()!=s2.length()) {
            System.out.println("both strings are not anagram");
        }

        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (Arrays.equals(str1, str2)) {
            System.out.println("Both strings are anagram");
            
        } else {
            System.out.println("Both strings are not anagaram");
        }
    }
}
