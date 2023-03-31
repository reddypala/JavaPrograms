package strings;

import java.util.HashMap;
import java.util.Map;

public class repeatedCharacters {
    // write a java program to find frequency of occurence of elements in an array
    public static void main(String[] args) {
        String str = "Hello, world!";

        // create a HashMap to store the character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();

        // loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // ignore spaces and punctuation
            if (ch == ' ' || !Character.isLetter(ch)) {
                continue;
            }

            // update the frequency count in the map
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // print the results
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
}

//Explanation:

/* 1. In this program, we first declare a string str and initialize it with some value.. 
2.Then, we create a HashMap called freqMap to store the element frequencies.
3.We loop through each character in the string using a 
for loop and check if the character is a letter or not.
4. If the character is a space or punctuation, we ignore it and move on to the next character. 
If the character is a letter, we update the frequency count in the freqMap using the put() method.
5.Finally, we loop through the freqMap using a for-each loop and 
print each key-value pair on a new line using System.out.println()*/