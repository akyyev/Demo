package com.demo.Interview_Questions.apple;

import java.util.*;

public class FindDuplicate_HashMap {

    public static void main(String[] args) {
        int[] arr = {1,5,5,3,3,3,6,6,6,6};
        System.out.println(getDuplicates(arr));

        int[] arr2 = {1,5,5,3,3,3,6,6,6,6};
        System.out.println(getDuplicatesAndSortBasedOnFrequency(arr2));

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(4,4);
        map.put(5,5);
        map.put(6,2);
        frequencyBasedPrint(map);

        //let’s say there is a key which takes 4 values and another
        // key which takes 3 values how you convert into hashMap?
        Map<Object, List<Object>> mp2 = new HashMap<>();
        mp2.put("First", new ArrayList<>(Arrays.asList(1,2,3,4)));
        mp2.put("Second", new ArrayList<>(Arrays.asList(1,2,3)));
        System.out.println("mp2 = " + mp2);

        System.out.printf("Slama %s amd %s", 23, 4);
    }

    /**
      1. Java program to find duplicates in a array using HashMap.
      2. WJP to sort the integer Array in Descending order based on the Frequency of its occurrence.
          Eg:
          i/p : [1,5,5,3,3,3,6,6,6,6]
          o/p : [6,3,5,1]
      3.Given a HashMap with Key and Value Pair, Print the Key based on frequency.
          Eg:
          i/p: 1:3
              4:4
              5:5
              6:2
          o/p : [1,1,1,4,4,4,4,5,5,5,5,5,6,6]
     */

    /**
     * finds duplicates in a array using HashMap.
     * @param arr
     * @return
     */
    private static List<Integer> getDuplicates(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(int each : arr){
            map.put(each, map.getOrDefault(each, 0)+1);
        }

        List<Integer> ls = new ArrayList<>();
        map.forEach((k,v)->{
            if(v>1) ls.add(k);
        });
        return ls;
    }

    /**
     * sorts an integer Array in Descending order based on the Frequency of its occurrence.
     * @param arr
     * @return
     */
    private static List<Integer> getDuplicatesAndSortBasedOnFrequency(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(int each : arr){
            map.put(each, map.getOrDefault(each, 0)+1);
        }

        List<Integer> ls = new ArrayList<>();
        map.forEach((k,v)->ls.add(k));
        ls.sort((m,n)-> map.get(n)-map.get(m));
        return ls;
    }


    /**
     * Given a HashMap with Key and Value Pair, Print the Key based on frequency.
     * @param map
     */
    private static void frequencyBasedPrint(Map<Integer, Integer> map){
        List<Integer> ls = new ArrayList<>();
        map.forEach((k,v)->{
            for (int i = 0; i < v; i++) {
                ls.add(k);
            }
        });

        System.out.println(ls);
    }



}
