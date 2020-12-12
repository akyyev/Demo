package com.demo.Interview_Questions;

import java.util.*;

public class Word_count {

    /**
     * Count the number of unique words in a string,
     * print them in alphabetical order.
     *
     * For example: 'blue fish red Fish'
     * Output: blue -1; fish-2; red -1;
     */
    public static void main(String[] args) {
        wordCount("blue fish red Fish");
    }

    private static void wordCount(String input){
        String[] arr = input.toLowerCase().split(" ");

        Map<String, Integer> mp = new HashMap<>();
        for(String word: arr){
            mp.put(word, mp.getOrDefault(word, 0)+1);
        }
        List<String> ls = new ArrayList<>(mp.keySet());
        Collections.sort(ls);

        ls.forEach(word->{
            System.out.print(word+"-");
            System.out.print(mp.get(word)+"; ");
        });
    }

}
