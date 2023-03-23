package strings;
import java.util.HashMap;
import java.util.Map;

public class repeatedWords {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog and the quick brown cat";
        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();

        // count the frequency of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        // print the repeated words and their frequency of occurrence
        System.out.println("Repeated words:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

//Explanation:

//1.The input sentence is split into an array of words using the split method.
//2.A HashMap is created to store the frequency of each word.
//3.The program iterates over each word in the array, and for each word:

       // (i).If the word is already in the HashMap, its count is incremented by 1.
       //(ii).If the word is not in the HashMap, a new entry is added with a count of 1.
//4.The program then iterates over the HashMap and prints the keys (i.e., the words) and 
//   their corresponding values (i.e., the frequency of occurrence) for words with a count greater than 1.
