package Arrays;

public class multidimensionalarray {
    public static void main(String[] args) {
        int[][] intArr = {{1,2,3,4},{5,6,7,8 }};   // 2 rows and 4 columns
        System.out.println(intArr.length);

        // The outer loop iterates through each row of the array,
        // and the inner loop iterates through each element in the current row.
        //outer loop traverse from 0 to till rows
        for(int i=0;i<intArr.length;i++){
            //inner loop traverse from 0 to number of columns
            for(int j =0;j<intArr[i].length;j++){
                System.out.print(intArr[i][j]+" ");
            }
            System.out.println();
        }


        // 2D string array
        String[][] sarr = {{"Ashok","Kumar"},{"HareRama","HareKrishna"},{"GautamaBuddha","RamakrishnaParamaHamsa"}};
        System.out.println("The lenght of the 2d array:"+sarr.length);
        // using for-each loop to print 2d array.

        for (String[] string1 : sarr) {
            for (String string2 : string1) {
                System.out.print(string2+" ");
            }
            System.out.println();
        }
    
    }
}
