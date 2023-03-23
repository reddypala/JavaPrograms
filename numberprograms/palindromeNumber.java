package numberprograms;

/*** palindrome number means reversing the number gives the original number ***/
public class palindromeNumber {
    public static void main(String[] args) {
        int num = 16461, revNum = 0, remainder;
        int originalNum=num;
        while (num != 0) {
            remainder = num % 10;
            revNum = revNum * 10 + remainder;
            num = num / 10;
        }
        if (originalNum==revNum) {
            System.out.println(originalNum+" "+"is palindrome number");
        } else {
            System.out.println(originalNum+" "+"is not a palindrome number");
        }
    }
}
