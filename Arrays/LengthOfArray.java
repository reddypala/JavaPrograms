package Arrays;

public class LengthOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int count = 0;
        /*for(int i = 1;i<=5;i++){
            count = count+1;
        }*/

        //using for-Each LOOP
        for (int i : arr) {
            count = count+1;
        }
        System.out.println("The length of array:"+count);
    }
}
