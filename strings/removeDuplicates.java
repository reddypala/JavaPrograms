package strings;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        
            String sentence = "The quick brown fox jumps and jumps  over the lazy dog and other fox";
            //1. Split the sentence into an array of words using the split method of the String class. 
            //You can split the sentence at spaces, 
            //commas, periods, or any other punctuation marks that you want to consider as word separators.
            String[] words = sentence.split("\\s");

            //2. Create a HashSet to store the unique words from the array. 
            //The HashSet automatically removes duplicates and maintains the order of insertion.
            Set<String> uniqueWords = new HashSet<>();

            //3. Iterate over the array of words and add each word to the HashSet.
            for (String word : words) {
                uniqueWords.add(word);
            }
            System.out.println("Unique words: ");
            // 4.Print the unique words in the HashSet using a for-each loop or any other method you prefer.
            for (String word : uniqueWords) {
                System.out.print(word + " ");
            }
        
        
    }
}
