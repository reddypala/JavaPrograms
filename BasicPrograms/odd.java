package BasicPrograms;

public class odd {

    static void oddNum(int num, int end){
        for(int i=num;i<=end;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        oddNum(1, 100);
    }
}
