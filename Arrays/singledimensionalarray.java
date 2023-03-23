package Arrays;

public class singledimensionalarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //using for-each loop 
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        // reverse printing of an array
        for (int j = arr.length; j > 0; j--) {
            System.out.print(arr[j - 1] + " ");
        }
    }
}
