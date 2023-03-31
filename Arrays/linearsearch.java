package Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 15, 67, 89, 30, 97, 56, 45, 34, 66 };

        int num = 34, flag = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Number" + num + " " + "found successfully.");
        } else {
            System.out.println("Number" + num + "not found successfully.");
        }
    }
}
