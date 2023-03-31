package Java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.event.SwingPropertyChangeSupport;

public class sorting2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        //sorting 
        names.stream().sorted().forEach(System.out::println);

        //2.create a array of integers 

        int[] arr = {87,65,-4,-7,-1,43,0,124,55,49,87};

        IntStream.of(arr).sorted().forEach(System.out::println);

        System.out.println();
        // print unique elements

        int[] arr2 = { 1, 2, 2, 4, 5, 4, 7, 8, 9, 3, 3 };

        IntStream.of(arr2).sorted().distinct().forEach(System.out::println);

        // String count 

       String s = "Hello";

       long c =s.chars().count();

       System.out.println("The number of characters in the string:"+c);

        // printing 2d array elements
       int[][] arr4 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        
       Arrays.stream(arr4)
             .flatMapToInt(Arrays::stream)
             .forEach(System.out::println);



        


    }
}
