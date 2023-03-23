package Arrays;

import java.util.Arrays;

public class secondlargestele {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 8, 11, 34, 33 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("second largest element in array is:" + arr[arr.length - 2]);
    }
}
