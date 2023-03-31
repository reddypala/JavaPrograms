package BasicPrograms;

public class sumofnaturalnumbers {

    static int sumofnaturalnumbers1(int n){
        int result = n*(n+1)/2;
        return result ;
    }
    public static void main(String[] args) {
        int num = 50, sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("sum of the natural numbers:" + sum);

        // int j = 1;
        // while (j <= num) {
        //     sum += j;
        // }
        // System.out.println("sum of the natural numbers:" + sum);
           System.out.println(sumofnaturalnumbers1(10));
    }
}
