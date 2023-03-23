package BasicPrograms;

import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        // print prime numbers in the given range
        int n1, n2, i, j;
        System.out.println("Enter any two numbers:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (i = n1; i <= n2; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(j + ",");
            }
        }
        sc.close();
    }
}
