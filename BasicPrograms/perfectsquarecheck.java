package BasicPrograms;

import java.util.Scanner;

public class perfectsquarecheck {

    static boolean checkSquare(double number){
        double sqrt = Math.sqrt(number);
        return ((sqrt-Math.floor(sqrt))==0);
    }
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (checkSquare(num)) {
            System.out.println("Entered number is perfect square");
        } else {
            System.out.println("not a perfect sqaure");
        }
    }
}
