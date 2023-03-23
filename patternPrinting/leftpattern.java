package patternPrinting;

public class leftpattern {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

// Explanation:

/*
 * The program consists of a nested loop structure.
 * The outer loop controls the number of rows, while the inner loop controls
 * the number of stars to be printed in each row.
 */

/*
 * For each iteration of the outer loop, the inner loop prints a certain number
 * of stars on the same line, equal to the value of the outer loop index. The
 * result is a right-angle triangle made up of stars, with the number of stars
 * increasing by one on each row.
 * The println() statement is used to move to the next line after each row is
 * printed.
 */
