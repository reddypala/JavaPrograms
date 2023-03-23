package strings;

public class reverseString {
    public static void main(String[] args) {
        String s = "LOOP";
        int i = s.length();
        while (i>0) {
            System.out.print(s.charAt(i-1));
            i--;
        }
    }
}
