package StringMethods;

public class StringMethods {
    public static void main(String[] args) {
        String s = "welcome to the string handling tutorials";
        char ch = s.charAt(6);
        System.out.println("character at index 6:"+ch);
        int count=0;
        String s1 = "Beginners Book";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("count of characters excluding space is:"+count);
        //print all characters in a string
        int counter=0;
        for(int i=0;i<=s1.length()-1;i++){
            System.out.println(s1.charAt(i));
            //occurence of a character
            if(s1.charAt(i)=='B'){
                counter++;
            }
        }
        System.out.println("B occured"+" "+counter+"'s"+" "+"in a string");

    }
}
