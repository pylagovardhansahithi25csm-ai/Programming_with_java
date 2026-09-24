package Observations;
   import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {

        // Creating TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // put()
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Mango");
        map.put(40, "Orange");
        map.put(50, "Grapes");

        System.out.println("TreeMap: " + map);

        // get()
        System.out.println("Value for key 30: " + map.get(30));

        // containsKey()
        System.out.println("Contains key 20: "
                           + map.containsKey(20));

        // containsValue()
        System.out.println("Contains value Mango: "
                           + map.containsValue("Mango"));

        // remove()
        map.remove(40);
        System.out.println("After removing key 40: " + map);

        // firstKey() and lastKey()
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // higherKey() and lowerKey()
        System.out.println("Higher key than 20: "
                           + map.higherKey(20));
        System.out.println("Lower key than 30: "
                           + map.lowerKey(30));

        // ceilingKey() and floorKey()
        System.out.println("Ceiling key of 25: "
                           + map.ceilingKey(25));
        System.out.println("Floor key of 25: "
                           + map.floorKey(25));

        // entrySet()
        System.out.println("Key-Value pairs: "
                           + map.entrySet());
    }
} 
