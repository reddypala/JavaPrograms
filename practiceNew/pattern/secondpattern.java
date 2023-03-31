package practiceNew.pattern;

public class secondpattern {
    public static void main(String[] args) {
    /*   *
        **
       ***
      ****
     *****    */

        int i, j, k;

        for (i = 1; i <= 5; i++) { // rows

            for (j = i; j < 5; j++) { // to maintain space
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++) { // columns
                System.out.print("*");
            }
            System.out.println(); 
        }
        System.out.println();

            /*  *****
                ****
                ***
                **
                *    */

        for (i = 1; i <= 5; i++) { // rows

            for (j = 1; j < i; j++) { // to maintain space
                System.out.print(" ");
            }

            for (k = i; k <= 5; k++) { // columns
                System.out.print("*");                    // providing space will print triangle pattern.
            }
            System.out.println(); 
        }
    }
}
