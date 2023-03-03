package setinterface;

/*
 * Properties of a set:
 * - No duplicates
 * - No ordering, i.e. elements coming in are not tracked. Exception: SortedSet and LinkedHashSet
 * - O(1) or O(log(n)) in searching (via contains() method)
 *  */

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSetExample.run();
    }
}

class SortedSetExample {
    static void run() {
        // s is stored in ascending order: "Good", "World", "morning". Notice 'm' not 'M' in "morning".
        SortedSet<String> s = new TreeSet<>(Arrays.asList("Good", "morning", "World"));
        System.out.println("s: " + s);

        // Iterate set: elements are automatically sorted in SortedSet
        for(String word : s) {
            System.out.println(word);
        }

        // Special elements
        String first = s.first();
        System.out.println("first: " + first);
        String last = s.last();
        System.out.println("last: " + last);

        // All elements but first
        // SortedSet<String> tail = s.tailSet(first + '\0'); // NULL character is needed by tailSet() for String
        SortedSet<String> tail = s.tailSet(first); // NULL character is needed by tailSet() for String
        System.out.println(tail);

        // All elements but last
        SortedSet<String> head = s.headSet(last);
        System.out.println(head);

        SortedSet<String> middle = s.subSet(first + '\0', last);
        System.out.println(middle);
    }
}
