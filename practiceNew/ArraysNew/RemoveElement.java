import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RemoveElement {
    public static void main(String[] args) {
        // int location, size;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array:");
        // size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements into the array:");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the location where the element need to be removed:");
        // location = sc.nextInt();
        // for (int i = location; i < size - 1; i++) {
        //     arr[i] = arr[i + 1];
        // }
        // size--;
        // for (int i = 0; i < size; i++) {
        //     System.out.print(arr[i] + "\t");
        // }

        //System.out.println();


        // removing elements from the string array.
        String[] arr1 = { "INTERSTELLAR", "KITCHEN", "T-Shirt", "JEANS" };

        int size1 = arr1.length;
        int location1 = 2;
        for (int i = location1; i < size1 - 1; i++) {
            arr1[i] = arr1[i + 1];

        }
        size1--;
        for (int i = 0; i < size1; i++) {
            System.out.print(arr1[i] + "\t");
        }


        int[] arr = { 1, 2, 3, 4, 5 };

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
    public static int[] removeTheElement(int[] arr, int index){
        if (arr == null
            || index < 0
            || index >= arr.length) {
 
            return arr;
        }

        IntStream.range(0, arr.length).filter(i -> i!=index).map(i->arr[i]).toArray();
    }
}
