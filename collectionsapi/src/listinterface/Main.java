package listinterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListExample.run();
    }
}

class ListExample {
    static void run() {
        // Create lists to work with
        List<String> l = new ArrayList<>(Arrays.asList("Good", "morning", "World"));
        System.out.println(l);
        List<String> words = Arrays.asList("G", "day", "There");
        System.out.println(words);

        // Using index in querying and setting elements
        String first = l.get(0);
        System.out.println("first String = " + first);
        String last = l.get(l.size() - 1);
        System.out.println("last String = " + last);
        l.set(1, "afternoon");
        System.out.println(l);

        // Appending and inserting elements
        l.add("!!");
        System.out.println(l);
        l.add(0, first);
        System.out.println(l);
        l.addAll(words);
        System.out.println(l);
        l.addAll(1, words);
        System.out.println(l);

        // Sublists: backed by the original list, i.e. all done to sublists are done to main list (shallow copy)
        List<String> sub = l.subList(1, 3); // 2nd and 3rd elements (1 inclusive, 3 exclusive)
        System.out.println(l);
        sub.set(0, "Good"); // modifies 2nd element of l
        System.out.println(l);
        sub.clear();
        System.out.println(l); // l lost its elements due to clear on sub (sub = shallow copy of l)

        // Sublists can restrict operations to a subrange of backing list due to shallow copy
        String s = Collections.max(l.subList(0, 4)); // Retrieve biggest element in sublist
        System.out.println(s);
        Collections.sort(l.subList(0, 4)); // Sorting just from index 0 to 4(exclusive)
        System.out.println(l);

        // Independent copies of sublist (notice keyword 'new') does not affect the parent list.
        // Use local copy if you want to modify a collection while iterating to prevent ConcurrentModificationException.
        List<String> subcopy = new ArrayList<>(l.subList(1, 3));
        System.out.println("subcopy: " + subcopy);
        subcopy.clear();
        System.out.println(subcopy);
        System.out.println(l);

        // Searching list
        last = l.get(l.size() - 1);
        System.out.println("last= " + last);
        int p = l.indexOf(last); // Where does the last word appear?
        System.out.println("\"" + last + "\"" + " first found at index " + p);
        p = l.lastIndexOf(last); // Search backward
        System.out.println("\"" + last + "\"" + " last found at index " + p);

        // Print the index of all occurences of last in l. Note sublist
        System.out.printf("indices of word \"%s\": %n", last);
        int n = l.size();
        p = 0;
        last = "day";
        while(p < n) {
            List<String> sublist = l.subList(p, n);
            int q = sublist.indexOf(last); // First appearance of last. -1 if not found
            if(q == -1) {
                break;
            }
            System.out.println(p + q);
            p += q + 1; // next start index of sublist
        }

        iteration(l);

        // Removing elements from a list
        System.out.println("l before removals: " + l);
        l.remove(last); // Remove first occurrence of last
        l.remove(0); // Remove element at specified index
        l.subList(0, 2).clear(); // Remove a range of elements using subList
        l.retainAll(words); // Remove all but elements in words
        l.removeAll(words); // Remove all occurrences of elements in words
        l.clear(); // Remove everything
        System.out.println("l after removals: " + l);

    }

    static <E> void iteration(Collection<E> collection) {
        System.out.println("1) Iterating through collection: " + collection);
        // Using foreach loop
        for(E e : collection) {
            System.out.println(e);
        }

        System.out.println("2) Iterating through collection: " + collection);
        for(Iterator<E> i = collection.iterator(); i.hasNext(); ) {
            System.out.println(i.next());
        }

        System.out.println("3) Iterating through collection: " + collection);
        Iterator<E> i = collection.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("4) Iterating only part of the collection using subList: ");
        System.out.println("Contents of collection: " + collection);
        for(Object o : ((ArrayList<E>)collection).subList(2, collection.size())) {
            System.out.println(o);
        }
    }

}
