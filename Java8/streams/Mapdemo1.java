package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo1 {
    public static void main(String[] args) {
        // Requirement: convert all the names into uppercase and store them into some
        // other collection.
        // source collection
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        // target collection
        List<String> vehInUpperCase = new ArrayList<>();

        // achieving requirement without using streams

        for (String names : vehicles) {
            vehInUpperCase.add(names.toUpperCase());
        }
        System.out.println(vehInUpperCase);

        // achieving the same with stream concept

        vehInUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println(vehInUpperCase);
    }
}
