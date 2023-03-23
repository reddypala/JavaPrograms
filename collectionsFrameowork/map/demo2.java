package collectionsFrameowork.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {

        // getting keys and values
        Map<String, String> map = new HashMap<>();

        map.put("B", "B");
        map.put("D", "H");
        map.put("A", "A");
        map.put("C", "R");
        map.put("E", "T");

        Set<String> keys = map.keySet();
        System.out.println("Keys in map are:" + keys);

        Collection<String> values = map.values();
        System.out.println("Values in the map:" + values);

        Map<String, String> map1 = new HashMap<>();

        map1.put("V", "Violet");
        map1.put("I", "Indigo");
        map1.put("B", "Blue");
        map1.put("G", "Green");
        map1.put("Y", "Yellow");
        map1.put("O", "Orange");
        map1.put("R", "Red");

        String value = map1.get("V"); // It will return a value for specified key in this map.
        System.out.println(value);

        boolean entryKey = map1.containsKey("B");
        System.out.println(entryKey);

        boolean entryValue = map1.containsValue("Brown");
        System.out.println(entryValue);

    }
}
