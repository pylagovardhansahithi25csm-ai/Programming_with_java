package Observations;
import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // put()
        map.put(101, "Arun");
        map.put(102, "Bala");
        map.put(103, "Chitra");
        System.out.println("Map after put()        : " + map);

        // put() with an existing key replaces the value
        String old = map.put(102, "Balaji");
        System.out.println("put(102, \"Balaji\") returned: " + old);
        System.out.println("Map after replace      : " + map);

        // get()
        System.out.println("get(102)               : " + map.get(102));
        System.out.println("get(999)               : " + map.get(999));

        // containsKey() and containsValue()
        System.out.println("containsKey(101)       : " + map.containsKey(101));
        System.out.println("containsKey(999)       : " + map.containsKey(999));
        System.out.println("containsValue(\"Chitra\") : " + map.containsValue("Chitra"));
        System.out.println("containsValue(\"Dinesh\") : " + map.containsValue("Dinesh"));

        // keySet(), values(), entrySet()
        System.out.println("keySet()               : " + map.keySet());
        System.out.println("values()               : " + map.values());
        System.out.println("entrySet()             : " + map.entrySet());

        // Traversing the entrySet
        System.out.println("Traversing entrySet:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        // size() and isEmpty()
        System.out.println("size()                 : " + map.size());
        System.out.println("isEmpty()              : " + map.isEmpty());

        // remove()
        System.out.println("remove(101)            : " + map.remove(101));
        System.out.println("remove(999)            : " + map.remove(999));
        System.out.println("Map after remove       : " + map);
        System.out.println("size()                 : " + map.size());

        // clear()
        map.clear();
        System.out.println("Map after clear()      : " + map);
        System.out.println("size()                 : " + map.size());
        System.out.println("isEmpty()              : " + map.isEmpty());
    }
}