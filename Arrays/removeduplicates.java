package Arrays;

//This Java program removes duplicates from an array and returns an array with only the unique elements.
public class removeduplicates {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 5, 5 };
		System.out.print("Original Array: ");
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		length = removeDuplicateElements(arr, length);
		System.out.println("");
		// Displaying array with non-duplicate elements
		System.out.print("Array after removing duplicate elements: ");
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int removeDuplicateElements(int[] arr, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		// creating a temporary variable to hold non-duplicate elements
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// copying temporary array to original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		} 
		return j;

	}
}

//Explanation:
// The program defines a method removeDuplicateElements that takes an array of integers and its 
// length as arguments, and returns an integer indicating the new length of the array 
// after removing duplicates. The method uses a temporary array temp to store the
// non-duplicate elements of the input array arr, and it keeps track of
// the index j of the last element in temp. It iterates over the input array arr, 
// comparing each element with the next one. If they are not equal, it copies the current element 
// to temp, increments j, and moves to the next element in arr. The last element of arr is copied to
// temp, and the method copies the elements of temp back to arr. Finally, the method returns 
// the new length of the array.

// The program also has a main method that initializes an array 
// arr with some duplicate elements, prints the original array, 
// calls the removeDuplicateElements method, and prints the resulting array.