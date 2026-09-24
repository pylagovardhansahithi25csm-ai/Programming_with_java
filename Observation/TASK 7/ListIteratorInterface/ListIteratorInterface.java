package Observations;
    import java.util.*;

public class ListIteratorInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
            Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        System.out.println("Original list          : " + list);

        ListIterator<String> li = list.listIterator();

        // Forward traversal: hasNext(), nextIndex(), next()
        System.out.println("Forward traversal:");
        while (li.hasNext()) {
            int index = li.nextIndex();
            String fruit = li.next();
            System.out.println("Index " + index + " : " + fruit);
        }
        System.out.println("nextIndex() at end     : " + li.nextIndex());
        System.out.println("previousIndex() at end : " + li.previousIndex());

        // Backward traversal: hasPrevious(), previousIndex(), previous()
        System.out.println("Backward traversal:");
        while (li.hasPrevious()) {
            int index = li.previousIndex();
            String fruit = li.previous();
            System.out.println("Index " + index + " : " + fruit);
        }
        System.out.println("hasPrevious() at start : " + li.hasPrevious());

        // set()
        ListIterator<String> li2 = list.listIterator();
        while (li2.hasNext()) {
            if (li2.next().equals("Banana")) {
                li2.set("Blueberry");
            }
        }
        System.out.println("List after set()       : " + list);

        // remove()
        ListIterator<String> li3 = list.listIterator();
        while (li3.hasNext()) {
            if (li3.next().equals("Cherry")) {
                li3.remove();
            }
        }
        System.out.println("List after remove()    : " + list);

        // add()
        ListIterator<String> li4 = list.listIterator();
        while (li4.hasNext()) {
            if (li4.next().equals("Apple")) {
                li4.add("Apricot");
            }
        }
        System.out.println("List after add()       : " + list);
    }
}

