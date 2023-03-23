package strings;

import java.util.Scanner;

public class reversesentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string:");
        String is = sc.nextLine();
        String op = reverseTheSentence(is);
        System.out.println("Input string:"+is);
        System.out.println("output string:"+op);
        sc.close();

    }

    public static String reverseTheSentence(String name){
        String[] words = name.split("\\s");
        String outputString = "";
        for(int i=words.length;i>0;i--){
            outputString = outputString+words[i-1]+" ";
        }
        return outputString;
    }
}
