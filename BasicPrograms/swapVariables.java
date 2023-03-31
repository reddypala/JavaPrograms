package BasicPrograms;

import java.util.Scanner;

public class swapVariables {
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y:");
        Scanner ip = new Scanner(System.in);
        x = ip.nextInt();
        y = ip.nextInt();
        System.out.println("before swapping:" + x + " " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("before swapping:" + x + " " + y);
    }
}
