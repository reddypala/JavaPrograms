package streams;

import java.util.Arrays;
import java.util.List;

public class toArray {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("A", "B", "C", "D", "1", "2", "3");
        Object[] arr = stringsList.stream().toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
