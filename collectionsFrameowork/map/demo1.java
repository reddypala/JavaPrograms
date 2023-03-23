package collectionsFrameowork.map;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        boolean isEmpty = map.isEmpty();
        System.out.println("The map is empty:" + isEmpty);

        // Adding entries in the map. Call put() method to add entries in map.
        map.put(101, "Red");
        map.put(103, "Green");
        map.put(102, "Yellow");
        map.put(104, "Blue");
        map.put(106, "Pink");
        System.out.println("Entries in Map: " + map);
        int size = map.size();
        System.out.println("No. of entries in Map: " + size);
        // Create another map.
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(115, "Brown");
        map2.put(120, "Purple");
        map2.put(125, "Green");
        map.putAll(map2);
        System.out.println("Entries in updated Map: " + map);

    }
}
