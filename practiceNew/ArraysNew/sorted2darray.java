package practiceNew.ArraysNew;

import java.util.Arrays;

public class sorted2darray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 4, 5, 2 }, { 7, 6, 9, 8, 10 }, { 13, 11, 15, 14, 12 },
                { 19, 20, 17, 16, 18 }, { 22, 25, 23, 21, 24 }, { 29, 30, 26, 28, 27 } };

        for (int[] i : arr) {
            Arrays.sort(i);
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
