package Observations;
    import java.util.LinkedHashMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {

        // Creating LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put()
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");
        map.put(104, "Orange");

        System.out.println("LinkedHashMap: " + map);

        // get()
        System.out.println("Value for key 102: " + map.get(102));

        // containsKey()
        System.out.println("Contains key 103: "
                           + map.containsKey(103));

        // remove()
        map.remove(104);
        System.out.println("After removing key 104: " + map);

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Key-Value pairs: " + map.entrySet());
    }
}

