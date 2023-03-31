package Arrays;

public class duplicateelements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4, 5, 4, 7, 8, 9, 3, 3 };
		// comparing each element of the array with other elements.
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

		// java program to find duplicate elements in a string array
		String[] names = new String[] { "Tom", "Steve", "Rick", "Steve", "Rick" };
		System.out.println("Duplicate elements in the given array: ");
		// comparing each element of the array with other elements.
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					System.out.println(names[j]);       // names[i] can also work.
				}
			}
		}
	}
}
