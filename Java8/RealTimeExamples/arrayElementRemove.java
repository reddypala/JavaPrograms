package RealTimeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayElementRemove {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(arr.length);
        
        String s = Arrays.toString(arr);
        System.out.println(s);

        List<Integer> li = new ArrayList<>();
        
        for (Integer i : arr) {
            li.add(i);
        }

        System.out.println(li);
        
        int index = 2;
        li.remove(index);
        System.out.println(li);
    }
}
