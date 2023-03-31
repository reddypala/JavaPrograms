package wrapperclasses;

public class reversesentence {
    public static void main(String[] args) {
        String s = "JAVA CONCEPT OF THE DAY";

        String[] words = s.split(" ");
        System.out.println(words.length);

        for (int i = words.length; i > 0; i--) {
            System.out.print(words[i-1] + " ");
        }
    }
}
