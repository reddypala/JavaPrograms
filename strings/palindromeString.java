package strings;

public class palindromeString {
    public static void main(String[] args) {
       String s = "RADAR", revStr="";
       int i = s.length();
       while(i>0){
        revStr = revStr+s.charAt(i-1);
        i--;
       }
       System.out.println("reversed string is:"+revStr);

       if (s.toLowerCase().equals(revStr.toLowerCase())) {
            System.out.println(s+" "+"is a palindrome string.");
       } else {
        System.out.println(s+" "+"is not a palindrome string.");
       }
    }
}
