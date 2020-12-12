package com.demo.Interview_Questions;

import java.util.*;

public class Collections_Practice {

    public static void main(String[] args) {

        //Queue(I) is like a line of people waiting to be served. First come first go. FIFO
        // Implements Collections(I)
        Queue<String> q = new PriorityQueue<>();
                      q = new LinkedList<>();

        q.add("A");
        q.add("B");
        q.offer("C");

        System.out.println(q); // A B C
        System.out.println(q.remove()); // Removes very first element from queue
        System.out.println(q.peek()); // Retrieves head, but does not remove
        System.out.println(q.poll()); // Retrieves head and removes it

        //Double Ended Queue
        Deque<Integer> dq = new ArrayDeque<>();
                        dq = new LinkedList<>();

        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.offerFirst(0);
        dq.offerLast(4);

        System.out.println(dq);

        System.out.println(dq.pollFirst()); //retries first and removes it
        System.out.println(dq.peekLast()); //retrieves last but does not remove


        Iterator<Integer> it = dq.iterator();

        while (it.hasNext()){
            System.out.println("Deque element: "+it.next());
        }

    }
}
