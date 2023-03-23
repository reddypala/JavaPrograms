package numberprograms;

public class reverseNumber {
    public static void main(String[] args) {
        int num = 3245, remainder, revNum = 0;

        while (num != 0) {
            remainder = num % 10;
            revNum = revNum * 10 + remainder;
            num = num / 10;
        }
        System.out.println("Reversed number is:"+revNum);
    }
}
