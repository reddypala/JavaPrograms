package wrapperclasses;

public class primeNumber {
    public static void main(String[] args) {

        checkForPrime(1137297);
        checkPrime(7);
        testPrime(7);
    }

    // prime number check, iterating from 2 to n-1.
    public static void checkForPrime(int num) {

        if (num == 1) {
            System.out.println("1 is neither prime nor composite.");
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " " + " is not prime number.");
                return;
            }
        }

        System.out.println("Number" + " " + num + " " + "is prime number");

    }
    // iterating from 2 to num/2.

    public static void checkPrime(int num) {
        if (num == 1) {
            System.out.println("1 is neither prime nor composite.");
            return;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " " + " is not prime number.");
                return;
            }
        }

        System.out.println("Number" + " " + num + " " + "is prime number");
    }

    // prime number check using square root method.

    public static void testPrime(int num) {

        if (num == 1) {
            System.out.println("given\t" + num +" "+ "is neither prime nor composite.");
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0){
                System.out.println("given\t" + num +" "+ "is not prime.");
                return;
            }
           
        }
        System.out.println("given\t" + num +" "+ "is  prime.");
    }
}
