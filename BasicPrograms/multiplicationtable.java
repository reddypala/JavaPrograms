package BasicPrograms;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        int n, i, result;
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 0; i <= 10; i++) {

            System.out.printf("%d*%d =%d\n", n, i, n * i);
        }
        sc.close();
    }

}
