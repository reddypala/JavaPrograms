package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//distinct count and limit
public class DistinctCountLimit {
    public static void main(String[] args) {

        List<String> vehiclesList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");

        List<String> distinctVehicles = vehiclesList.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctVehicles);

        // count

        long count = vehiclesList.stream().distinct().count();
        System.out.println(count);

        // limit

        List<String> limitedVehiclesList = vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited vehicles:"+limitedVehiclesList);
    }
}
