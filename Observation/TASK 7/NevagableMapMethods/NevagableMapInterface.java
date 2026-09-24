package Observations;
import java.util.*;
public class NevagableMapInterface {

    public static void main(String[] args) {
        NavigableMap<Integer, String> nm = new TreeMap<>();

        nm.put(30, "Chitra");
        nm.put(10, "Arun");
        nm.put(50, "Eswar");
        nm.put(20, "Bala");
        nm.put(40, "Dinesh");
        System.out.println("NavigableMap           : " + nm);

        // lowerKey() - strictly less than
        System.out.println("lowerKey(30)           : " + nm.lowerKey(30));
        System.out.println("lowerKey(10)           : " + nm.lowerKey(10));

        // floorKey() - less than or equal
        System.out.println("floorKey(30)           : " + nm.floorKey(30));
        System.out.println("floorKey(35)           : " + nm.floorKey(35));
        System.out.println("floorKey(5)            : " + nm.floorKey(5));

        // ceilingKey() - greater than or equal
        System.out.println("ceilingKey(30)         : " + nm.ceilingKey(30));
        System.out.println("ceilingKey(35)         : " + nm.ceilingKey(35));
        System.out.println("ceilingKey(55)         : " + nm.ceilingKey(55));

        // higherKey() - strictly greater than
        System.out.println("higherKey(30)          : " + nm.higherKey(30));
        System.out.println("higherKey(50)          : " + nm.higherKey(50));

        // firstEntry() and lastEntry()
        System.out.println("firstEntry()           : " + nm.firstEntry());
        System.out.println("lastEntry()            : " + nm.lastEntry());

        // descendingMap()
        System.out.println("descendingMap()        : " + nm.descendingMap());

        // pollFirstEntry() and pollLastEntry()
        System.out.println("pollFirstEntry()       : " + nm.pollFirstEntry());
        System.out.println("pollLastEntry()        : " + nm.pollLastEntry());
        System.out.println("Map after polling      : " + nm);
    }
}
