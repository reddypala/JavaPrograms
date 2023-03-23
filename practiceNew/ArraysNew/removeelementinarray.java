package practiceNew.ArraysNew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// removing element from an array at specific index using arraylist.
public class removeelementinarray {
    public static void main(String[] args) {
        // Get the array
        int[] arr = { 1, 2, 3, 4, 5 };
 
        // Print the resultant array
        System.out.println("Original Array: "
                        + Arrays.toString(arr));
 
        // Get the specific index
        int index = 2;
 
        // Print the index
        System.out.println("Index to be removed: "
                        + index);
 
        // Remove the element
        arr = removeTheElement(arr, index);
 
        // Print the resultant array
        System.out.println("Resultant Array: "
                        + Arrays.toString(arr)); 
    }
    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index)
    {
 
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
            || index < 0
            || index >= arr.length) {
 
            return arr;
        }
 
        // Create ArrayList from the array
        List<Integer> arrayList = IntStream.of(arr)
                                    .boxed()
                                    .collect(Collectors.toList());
 
        // Remove the specified element
        arrayList.remove(index);
 
        // return the resultant array
        return arrayList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
