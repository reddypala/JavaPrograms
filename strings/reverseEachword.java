package strings;

// reverse sentence and each word
public class reverseEachword {
    public static void main(String[] args) {
        String s = "java concept of the day";
        System.out.println(s.length());
        String rev = "";
        for (int i = s.length(); i > 0; i--) {
            rev = rev + s.charAt(i - 1);
        }
        System.out.println("reversed String:" + rev);

        // REVERSE ONLY WORD AND SENTENCE REMAINS SAME

        System.out.println("REVERSE ONLY WORD AND SENTENCE REMAINS SAME");
        
        // split the given string sentence into string words array
        String[] words = s.split(" ");
        for (String w : words) {
            System.out.print(w + " ");
        }
        String output = " ";
        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();
            for (int j = ch.length; j > 0; j--) {
                output = output + ch[j - 1];

            }
            output = output.toString() + " ";

        }
        System.out.println("\nThe reverse word sentence:" + output);
    }
}
