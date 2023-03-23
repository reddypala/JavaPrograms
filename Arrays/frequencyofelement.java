package Arrays;

public class frequencyofelement {
    public static void main(String[] args) {
        int[] numbers = new int[] { 2, 2, 3, 4, 5, 5, 5, 3, 2, 4 };
        int[] freq = new int[numbers.length];
        int counted = -1;
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    freq[j] = counted;
                }

            }
            if (freq[i] != counted) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != counted)
                System.out.println("Element: " + numbers[i] + " Frequency: " + freq[i]);
        }
    }
}
