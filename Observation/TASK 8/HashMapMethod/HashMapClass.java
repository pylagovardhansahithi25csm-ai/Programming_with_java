package Observations;
 import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // put()
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");
        map.put(104, "Orange");

        System.out.println("HashMap: " + map);

        // get()
        System.out.println("Value for key 102: " + map.get(102));

        // containsKey()
        System.out.println("Contains key 103: "
                           + map.containsKey(103));

        // containsValue()
        System.out.println("Contains value Mango: "
                           + map.containsValue("Mango"));

        // getOrDefault()
        System.out.println("Value for key 105: "
                           + map.getOrDefault(105, "Not Found"));

        // remove()
        map.remove(104);
        System.out.println("After removing key 104: " + map);

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Key-Value pairs: " + map.entrySet());

        // size()
        System.out.println("Size of HashMap: " + map.size());

        // isEmpty()
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear(): " + map);

        System.out.println("Is HashMap empty after clear()? "
                           + map.isEmpty());
    }
}