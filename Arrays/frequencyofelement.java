package Arrays;

import java.util.HashMap;
import java.util.Map;

public class frequencyofelement {
    public static void main(String[] args) {
        int[] numbers = new int[] { 2, 2, 3, 4, 5, 5, 5, 3, 2, 4 };
        int[] freq = new int[numbers.length];
        int counted = -1;
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    freq[j] = counted;
                }

            }
            if (freq[i] != counted) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != counted)
                System.out.println("Element: " + numbers[i] + " Frequency: " + freq[i]);
        }

        // Explanation
        /*
         * First, an integer array freq is initialized with the same length as numbers.
         * Then, two for loops are used to iterate through each element of the numbers
         * array. The outer loop iterates from the first element to the last element,
         * while the inner loop starts from the next element to the end of the array.
         * Inside the inner loop, the program checks whether the current element is
         * equal to the next element. If it is, then the count is incremented and the
         * frequency of the next element is set to a special value -1 to indicate that
         * it has already been counted.
         * After the inner loop, the program checks whether the current element has
         * already been counted. If it hasn't, then the frequency of the current element
         * is set to the count.
         * Finally, a for loop is used to iterate through the freq array and print the
         * frequency of each element that has not already been counted.
         * 
         */
        // using hashmap

        int[] arr = { 2, 2, 3, 4, 5, 5, 5, 3, 2, 4 };

        // create a HashMap to store the element frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();

        // loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            // update the frequency count in the map
            freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
        }

        // print the results
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
