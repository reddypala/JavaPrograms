package Arrays;

public class copyelements {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 8 };
        int[] arr2 = new int[arr1.length];
        // displaying all elements of array1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        // copying elements
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements in new array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    
    }
}
