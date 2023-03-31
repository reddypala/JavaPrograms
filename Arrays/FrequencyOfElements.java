package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

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

//Explanation:
/*In this program, we first declare an integer array arr and initialize it with some values. 
Then, we create a HashMap called freqMap to store the element frequencies. 
We loop through each element in the array using a for loop and update the frequency count 
in the freqMap using the put() method.
Finally, we loop through the freqMap using a for-each loop and print each key-value pair on a new line using System.out.println(). */