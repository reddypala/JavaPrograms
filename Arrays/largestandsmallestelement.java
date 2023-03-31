package Arrays;

public class largestandsmallestelement {
    public static void main(String[] args) {
        int[] num = {25,11,7,65,76};
        //int max = Integer.MIN_VALUE;
        int max = num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("largest element in an array:"+max);
        //smallest element in an array
        //int min = Integer.MAX_VALUE;
        int min = num[0];
        for(int k=0;k<num.length;k++){
            if(num[k]<min){
                min=num[k];
            }
        }
        System.out.println("smallest element in an array:"+min);
    }
}
