package data.javaconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeAndFast {
    
    public static void main(String[] args) {
        // fail-fast
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");

        Iterator<String> iterator = letters.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            // letters.add("K"); // causes java.util.ConcurrentModificationException
        }


        // fail-safe (NOT TO MIX with => Thread - SaFe)
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
            list.add("four");  // This won't cause ConcurrentModificationException
            list.remove("one");
        }

        System.out.println("List after iteration: " + list);
        
        /**
         * NOTE: 
         *  Fail-Safe: Indicates that an iterator will not throw ConcurrentModificationException if the collection
         *             is modified during iteration. This is typically achieved by working on a copy of the collection.
         *  Thread-Safe: Indicates that a collection or class can be safely accessed by multiple threads concurrently,
         *               typically through synchronization or other concurrency control mechanisms.
         */
    }
}

