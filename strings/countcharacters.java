package strings;

public class countcharacters {
    public static void main(String[] args) {
        String s = "The best of both words";
        System.out.println(s.length()); // This returns the length of the string including spaces 22
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!= ' ') {
                count++;
            }
        }
        System.out.println("The number of characters in a string is:" + count); // excluding spaces 18.
        
    }
}
