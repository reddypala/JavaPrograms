package BasicPrograms;

public class even {
	static void evenNum(int num, int end) {
		for (int i = num; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		evenNum(1, 100);
	}
}
