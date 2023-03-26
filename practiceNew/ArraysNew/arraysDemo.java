package practiceNew.ArraysNew;

public class arraysDemo {
    public static void main(String[] args) {
        // 2D Integer array.
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } };
        System.out.println("The length of the array is:" + arr.length);
        // using foreach loop to iterate through the 2d array.

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 2D string array
        String[][] sarr = { { "Ashok", "Kumar" }, { "HareRama", "HareKrishna" },
                { "GautamaBuddha", "RamakrishnaParamaHamsa" } };
        System.out.println("The lenght of the 2d array:" + sarr.length);
        // using for-each loop to print 2d array.

        for (String[] string1 : sarr) {
            for (String string2 : string1) {
                System.out.print(string2 + " ");
            }
            System.out.println();
        }

        // printing 2d array elements in reverse order
        int[][] arr1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = arr1[i].length; j > 0; j--) {
                System.out.print(arr1[i][j - 1] + " ");
            }
            System.out.println();
        }
    }

}
