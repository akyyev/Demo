package com.demo.Interview_Questions;

import java.util.*;

public class String_frequency_of_charachters {
    public static void main(String[] args) {
        frequency_char3("Bagtyyar");

        find_consec_max_occur("bbaaaabbbbaaaaaaacd");
    }

    /**
     * Find the maximum consecutive occurrences of a character in a string supplied.
     * For e.g. “bbaaaabbbbaaaaaaacd”, should result in a: 7, b: 4, c: 1, d: 1 NOTE: “a” occurs twice consecutively,
     * but the second instance has the maximum occurrence.
     * @param word
     */
    private static void find_consec_max_occur(String word) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = word.toCharArray();

        char target = arr[0];
        int count = 0;

        for(int i=0; i<arr.length; i++){

            if(target==arr[i]) {
                count++;
            }
            else{
                count=1;
                target = arr[i];
            }
            if(map.getOrDefault(target,0)<count) map.put(target, count);
        }

        System.out.println(map);
    }


    private static void frequency_char(String input) {
        Map<Character, Integer> freq = new LinkedHashMap<>();

        for(char c : input.toUpperCase().toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> each: freq.entrySet()){
            System.out.println(each.getKey()+" = "+each.getValue());
        }
    }

    /**
     * Not optimal solution
     * @param input
     */
    private static void frequency_char2(String input) {
        input = input.toUpperCase();

        String processed = "";

        for(int i=0; i<input.length(); i++){
            int count = 0;

            for(int j=0; j<input.length(); j++){
                if(input.charAt(i)== input.charAt(j)) count++;
            }
            if(!processed.contains(input.charAt(i)+"")) System.out.println(input.charAt(i)+" = "+ count);
            processed += input.charAt(i);
        }
    }

    private static void frequency_char3(String input){
        // To store 26 characters frequency in an array
        int[] arr = new int[26];

        // To get frequency of each letter by referencing character - A
        for(char each: input.toUpperCase().toCharArray()){
            arr[each-'A']++;
        }

        for (char each: input.toUpperCase().toCharArray()){
            if(arr[each-'A']!= 0) {
                System.out.println(each+" = "+arr[each-'A']);
                // To prevent duplicate prints to the console
                // Here if I reset the frequency of the character to zero
                // we will not get that character later on
                arr[each-'A']= 0;
            }
        }
    }




}
