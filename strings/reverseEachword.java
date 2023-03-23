package strings;

// reverse sentence and each word
public class reverseEachword {
    public static void main(String[] args) {
        String s = "java concept of the day";
        System.out.println(s.length());
        String rev = "";
        for(int i=s.length();i>0;i--){
            rev = rev+s.charAt(i-1);
        }
        System.out.println("reversed String:"+rev);
    }
}
