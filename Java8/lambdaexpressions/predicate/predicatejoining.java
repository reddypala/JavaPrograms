package predicate;

import java.util.function.Predicate;

public class predicatejoining {
    public static void main(String[] args) {
        int[] a = { 5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65 };
        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = j -> j > 50;

        System.out.println("numbers which are even and greater than 50 are:");
        for (int n : a) {
            if (p1.and(p2).test(n)) {
                System.out.println(n);
            }
        }
        System.out.println("Numbers which are either even or greater than 50 are:");
        for (int n : a) {
            if (p1.or(p2).test(n)) {
                System.out.println(n);
            }
        }
        System.out.println("Numbers which are odd are:");
        for (int n : a) {
            if (p1.negate().test(n)) {
                System.out.println(n);
            }
        }
    }
}
