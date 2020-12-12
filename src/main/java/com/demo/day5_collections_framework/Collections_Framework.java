package com.demo.day5_collections_framework;

import java.util.*;

public class Collections_Framework {

    /**
     * Java Collection means a single unit of objects.
     * Java Collection framework provides many
     * interfaces : (Set, List, Queue, Deque)
     * and classes:  (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
     *
     * Do You Know?
     *      What are the two ways to iterate the elements of a collection?
     *      What is the difference between ArrayList and LinkedList classes in collection framework?
     *      What is the difference between ArrayList and Vector classes in collection framework?
     *      What is the difference between HashSet and HashMap classes in collection framework?
     *      What is the difference between HashMap and Hashtable class?
     *      What is the difference between Iterator and Enumeration interface in collection framework?
     *      How can we sort the elements of an object? What is the difference between Comparable and Comparator interfaces?
     *      What does the hashcode() method?
     *      What is the difference between Java collection and Java collections?
     *
     *  Methods:
     *      add(Object), add(index, Object)
     *      addAll(Collection)
     *      remove(Object)
     *      removeAll(Collection)
     *      size()
     *      clear(): Clears everything from collection
     *      contains(Object): true/false
     *      containsAll(Collection): true/false
     *      isEmpty(): true/false
     *      equals():
     *      hashCode()
     *
     *
     */

    public static void main(String[] args) {
        //List(I) <-- ArrayList(C), LinkedList(C), Vector(C) <-- Stack(C)
        List<Integer> intList = new ArrayList<>();
        List<Integer> intList2 = new LinkedList<>();
        List<Integer> intList3 = new Vector<>();
        List<Integer> intList4 = new Stack<>();

        intList.add(10);
        intList.add(30);
        intList.add(20); //10,30,20
        intList.add(1,50);
        intList.addAll(Arrays.asList(100,200,300));


        System.out.println(intList); //10,50,30,20,100,200,300

        int removedNumber  = intList.remove(6); // will remove number from index = 6;
        boolean removing100isSuccessful = intList.remove((Integer) 100);
        boolean removingNumbersIsSuccessful = intList.removeAll(Arrays.asList(10,50));
        System.out.println(intList);
        System.out.println(removedNumber);
        System.out.println(removing100isSuccessful);
        System.out.println(removingNumbersIsSuccessful);
        System.out.println(intList.size());
        intList.clear();
        System.out.println("After clearing elements from the list:"+intList);
        System.out.println("Is our list empty?: "+intList.isEmpty());


        /**
         * ArrayList: Array based class, internally uses dynamic array.
         *         (better for storing and accessing data)
         *
         * LinkedList: Each objects are doubly linked in the LinkedList
         *         adding and moving data are fast
         *         but, retrieving data is slower
         *                 (better for manipulating)
         *
         * Vector: synchronized, only preferred in multi-threads.
         *         synchronized keyword: used to achieve --> Thread safe in multi-thread environment
         *         multi-thread: multiple threads try to get access to same resources
         *
         *         Advantage: Thread safe in multi-thread environment
         *         Drawback: Slower
         *
         *         Has a child class: Stack
         *
         *         Stack: pop() method--> LIFO (Last in, first out)
         *                              it also returns the last added object
         *
         */

        Stack<String> stackList = new Stack<>();

        stackList.addAll(Arrays.asList("Beza", "Toyly", "Nury", "X"));
        stackList.add("X-man");
        String lastAddedName = stackList.pop();

        System.out.println(lastAddedName);
        System.out.println(stackList);


        /**
         * Queue(I) <-- Deque(I) <-- LinkedList(C), ArrayDeque(C)
         * Queue(I) <-- PriorityQueue(C)
         */

        Deque<Character> list = new LinkedList<>();
        Deque<Character> list2= new ArrayDeque<>();
        Queue<Character> list3 = new PriorityQueue<>();

        /**
         * Set(I)<-- SortedSet(I)<--TreeSet(C)
         *       <-- HashSet(C), LinkedHashSet(C)
         *
         *       Set(I): each element is unique, no duplicates
         *
         *          SortedSet(I) is implemented by TreeSet(C)
         *              TreeSet(C): no duplicate and collection is sorted
         *          HashSet(): no duplicate,
         *          LinkedHashSet is the ordered version of HashSet.
                                            The only difference between HashSet and LinkedHashSet
                                            is that: LinkedHashSet maintains the insertion order.
                                            When we iterate through a HashSet, the order is unpredictable
                                            while it is predictable in case of LinkedHashSet.
         *
         */

        Set<Integer> hashSetList = new HashSet<>();
        hashSetList.addAll(Arrays.asList(100,20,30,40,200,300,300)); //order is unpredictable, no duplicates

        System.out.println(hashSetList);


        Set<Integer> linkedHashSetList = new LinkedHashSet<>();
        linkedHashSetList.addAll(Arrays.asList(100,20,30,40,200,300,300)); //order is conserved, no duplicates

        System.out.println(linkedHashSetList);


        System.out.println("-------------------------------------");
        //Task: remove duplicates from an ArrayList, and sort it
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100,100, 50,200,500,300,250,450,450,200));
        System.out.println("My numbers before: "+numbers);

        SortedSet<Integer> numbers2 = new TreeSet<>(numbers);
        System.out.println("My numbers are now sorted and each one is unique: "+ numbers2);




        ArrayList<Integer> hardWay = new ArrayList<>();
        numbers.forEach(each->{
            if(!hardWay.contains(each)) hardWay.add(each);
        });
        Collections.sort(hardWay);
        System.out.println("My numbers are now sorted and each one is unique: "+ hardWay);



    }

}

