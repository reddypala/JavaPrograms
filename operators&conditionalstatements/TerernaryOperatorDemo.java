
public class TerernaryOperatorDemo {
    public static void main(String[] args) {
        String result;
        int x = 8;
        int y = 9;
        // if (x > y) {
        //     result = "x is greater than y";
        // } else {
        //     result = "y is greater than or equal to x";
        // }
        // System.out.println(result);

        result = x > y ? "x is greater than y" : "y is greater than x";
        System.out.println(result);
    }
}
