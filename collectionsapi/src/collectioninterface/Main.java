package collectioninterface;

// This code shows all important use of Collection interface.
// Collection is extended by List and Set interfaces.
// List interface is implemented by AbstractList class.
// AbstractList is extended by LinkedList, ArrayList, Vector classes
// Set is extended by SortedSet interface.
// SortedSet interface is implemented by TreeSet.
// HashSet extends Set interface.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> c = new HashSet<>();

        Collection<String> d = Arrays.asList("one", "two");
        Collection<String> e = Collections.singleton("three");

        c.add("zero");
        c.addAll(d);

        Collection<String> copy = new ArrayList<>(c);

        c.remove("zero");
        c.removeAll(e);
        c.retainAll(d);
        c.clear();

        boolean b = c.isEmpty();
        int s = c.size();

        c.addAll(copy);

        b = c.contains("zero");
        b = c.containsAll(d);

        System.out.println(c);

        // Shallow copy to an array
        Object[] elements = c.toArray();

        String[] strings = c.toArray(new String[c.size()]);
        strings = c.toArray(new String[0]);

        Collection<Integer> i = Arrays.asList(1, 2, 3);
        Object[] oi = i.toArray();
        Integer[] ints = i.toArray(new Integer[0]);
    }
}
