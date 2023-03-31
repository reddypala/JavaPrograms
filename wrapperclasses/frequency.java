package wrapperclasses;

public class frequency {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2, 5, 6, 6, 7, 8, 6, 2, 2, 5, 5, 3, 3 };

        int[] freq = new int[arr.length];
        int counted = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = counted;
                }
                if (freq[i] != counted) {
                    freq[i] = count;
                }

            }

        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != counted) {
                System.out.println("Elemenent" + " " + arr[i] + " " + "Frequency" + " " + freq[i]);
            }
        }
    }
}
