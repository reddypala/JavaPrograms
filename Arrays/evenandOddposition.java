package Arrays;

public class evenandOddposition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        //print odd position elements in an array
        for(int i=0;i<arr.length;i+=2){
            System.out.println(arr[i]);
        }
        System.out.println();
        //print even position elements in an array
        for(int i=1;i<arr.length;i+=2){
            System.out.println(arr[i]);
        }

    }
}
