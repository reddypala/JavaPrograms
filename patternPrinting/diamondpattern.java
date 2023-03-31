package patternPrinting;

public class diamondpattern {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) // rows
        {
            for (j = 5; j > i; j--) // space maintenance
            {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) // columns
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 5; i >= 1; i--) // rows
        {
            for (j = 5; j > i; j--) // space maintenance
            {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) // columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
