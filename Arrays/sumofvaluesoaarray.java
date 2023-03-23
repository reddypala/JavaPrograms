package Arrays;

public class sumofvaluesoaarray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 3, 5, 6, 7, 8, 9, 10 };
        sum(arr);

    }

    public static void sum(int[] arr) {
        int sum = 0;
        // using normal for loop
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // using for-each loop
        // for (int i : arr) {
        // sum = sum+i;
        // }
        System.out.println("sum of the values of the array:" + sum);
    }
}
