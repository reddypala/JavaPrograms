package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo2 {
    public static void main(String[] args) {
        // Requirement: find the length of every element and put those lengths into some
        // other collection.
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<Integer> length = new ArrayList<>();
        // without using streams
        for (String name : vehicles) {
            System.out.println(name.length());
            length.add(name.length());
        }
        System.out.println(length);

        // using stream concept

        vehicles.stream().map(vname -> vname.length()).forEach(len -> System.out.println(len));
        length = vehicles.stream().map(vname -> vname.length()).collect(Collectors.toList());
        System.out.println(length);
    }
}
