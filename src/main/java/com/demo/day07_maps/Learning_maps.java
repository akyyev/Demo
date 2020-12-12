package com.demo.day07_maps;

import java.util.*;

public class Learning_maps {

    // key-value pair

    public static void main(String[] args) {



        /**
         *  Map Interface  --   No indexing
         *      Hashtable (C)
         *      HashMap (C)     <--  LinkedHashMap (C)
         *      SortedMap (I)   <-- TreeMap (C)                (Sorts according to keys)
         *
         *
         *      HashTable -- synchronized  -- doesn't accept null value --order unpredictable  --
         *      HashMap -- not synchronized -- accepts null value -- order predictable --
         */

        // phone list (name - phone number)
        SortedMap<String, Integer> phoneList =  new TreeMap<>();

        phoneList.put("Beza", 234);
        phoneList.put("Toyly", 123);
        phoneList.put("Nury", 987);
        phoneList.put("Aynur", 678);

        System.out.println(phoneList);
        System.out.println( phoneList.get("Toyly")); //123
        System.out.println( phoneList.get("ABC")  ); //null

        phoneList.values().forEach(x-> System.out.println(x));


        for(Map.Entry<String, Integer> each : phoneList.entrySet()){
            System.out.println("Key: " + each.getKey());
        }

        //How to get a key with value of 987?
        for(Map.Entry<String, Integer> each : phoneList.entrySet()){
            if(each.getValue()==987) System.out.println(each.getKey());
        }

        //This is also handy way of getting all keys as a set
        Set<String> keySet = phoneList.keySet();

        //remove(k), containsKey(k)
        phoneList.remove("Beza");
        System.out.println(phoneList.containsKey("Beza"));



        Map<Integer, String> orders = new HashMap<>();
        orders.put(1, "Book");
        orders.put(2, "Pen");
        orders.put(3, "Tv_Stick");
        orders.put(4, "Phone");
        String VALUE = orders.remove(2);

        for(Map.Entry<Integer, String> entry : orders.entrySet()){
            System.out.println(entry.getValue());
        }

        System.out.println(VALUE);



    }

}
