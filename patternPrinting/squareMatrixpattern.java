package patternPrinting;

public class squareMatrixpattern {
    public static void main(String[] args) {
        // sqaure matrix pattern
        int i, j;
        for (i = 1; i <= 5; i++) { // rows
            for (j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // To print the below pattern.
        /*  * * * * *
            *       *
            *       *
            *       *
            * * * * *    */

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
