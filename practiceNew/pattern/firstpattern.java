package practiceNew.pattern;

public class firstpattern {
    public static void main(String[] args) {

        int i, j;
        for (i = 1; i <= 5; i++) {         //rows
            for (j = 1; j <= i; j++) {        //columns
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
