package strings;

public class countcharacters {
    public static void main(String[] args) {
        String s = "The best of both words";
        System.out.println(s.length());
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!= ' ') {
                count++;
            }
        }
        System.out.println("The number of characters in a string is:" + count);
    }
}
