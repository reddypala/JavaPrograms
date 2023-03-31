package practiceNew.pattern;

public class EquilateralTrianglepattern {
    public static void main(String[] args) {

        int i, j, k;
        for (i = 1; i <= 5; i++) // rows
        {
            for (j = 5; j > i; j--) // space maintenance
            {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) // columns
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // program2: printing double stars
        for (i = 1; i <= 5; i++) // rows
        {
            for (j = 5; j > i; j--) // space maintenance
            {
                System.out.print(" ");
            }
            for (k = 1; k <= 2*i-1; k++) // columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
