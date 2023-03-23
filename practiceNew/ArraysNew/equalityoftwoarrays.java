package practiceNew.ArraysNew;

import java.util.Arrays;

public class equalityoftwoarrays {
    public static void main(String[] args) {
        // using iterative method
        int[] arrayOne = {2, 5, 1, 7, 4};  
        int[] arrayTwo = {2, 5, 1, 7, 4};
        boolean equalOrNot = true;
          
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
          
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }

        //using Arrays.equals() method
        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
  
        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
  
        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
  
        System.out.println(Arrays.equals(s1, s2));        //Output : false
  
        System.out.println(Arrays.equals(s1, s3));      //Output : true
    }
}
