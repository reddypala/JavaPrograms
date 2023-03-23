package StringMethods;

public class startsWith {
    public static void main(String[] args) {
        // given string
        String s = "This is just a sample string";

        // checking whether the given string starts with "This"
        System.out.println(s.startsWith("This"));

        // checking whether the given string starts with "Hi"
        System.out.println(s.startsWith("Hi"));

        String str = new String("quick brown fox jumps over the lazy dog");
        System.out.println("String str starts with quick: " + str.startsWith("quick"));
        System.out.println("String str starts with brown: " + str.startsWith("brown"));
        System.out.println("substring of str(starting from 6th index) has brown prefix: "
                + str.startsWith("brown", 6));
        System.out.println("substring of str(starting from 6th index) has quick prefix: "
                + str.startsWith("quick", 6));
    }
}
