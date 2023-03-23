package Arrays;

import java.util.Arrays;

public class arraysort1 {
    public static void main(String[] args) {
        int[] arr = { 45, 23, 12, 65, 23, 30, 1, 5, 7, 3 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
