package strings;

public class reverseString {
    public static void main(String[] args) {
        String s = "LOOP";
        // int i = s.length();
        // while (i>0) {
        // System.out.print(s.charAt(i-1));
        // i--;
        // }

        // using only normal for loop

        for (int i = s.length(); i > 0; i--) {
            System.out.print(s.charAt(i - 1) + " ");
        }
        System.out.println();
        // using normal for loop and converting string to char array
        char[] ch = s.toCharArray();
        for (int j = ch.length; j > 0; j--) {
            System.out.print(ch[j - 1]);

        }

    }
}
