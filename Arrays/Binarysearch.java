package Arrays;

public class Binarysearch{
    public static void main(String[] args) {
        int[] arr = { 7, 10, 18, 21, 35, 45, 48, 50 };
        int i = Search(arr, 8, 50);
        if (i == -1) {
            System.out.println("Element not found in an array.");

        } else
            System.out.println("Element found in the array at the index location" + " " + i);

    }

    public static int Search(int[] arr, int size, int key) {
        int lowIndex = 0;
        int HighIndex = size - 1;
        int middleIndex;

        while (HighIndex >= lowIndex) {
            middleIndex = (HighIndex + lowIndex) / 2;
            if (key == arr[middleIndex]) {
                System.out.println(key + " " + "match found");
                return middleIndex;

            }
            if (key > arr[middleIndex]) {
                lowIndex = middleIndex + 1;

            } else
                HighIndex = middleIndex - 1;

        }
        return -1;
    }
}
