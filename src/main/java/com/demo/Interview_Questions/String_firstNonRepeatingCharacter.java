package com.demo.Interview_Questions;

import com.google.gson.internal.$Gson$Types;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class String_firstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatingCharacter3("abbak"));
    }

    @Test(description = "")
    public void test1(){
        assert getFirstNonRepeatingCharacter("abc") == 'a';
    }

    @Test(description = "Testing string with all repeated characters")
    public void test2(){
        assert getFirstNonRepeatingCharacter("aaaa") == ' ';
    }

    @Test(description = "")
    public void test3(){
        assert getFirstNonRepeatingCharacter("aaabccc") == 'b';
    }


    private static char getFirstNonRepeatingCharacter(String abc) {

        for(int i=0; i<abc.length(); i++){
             if(getFreq(abc, abc.charAt(i))== 1) return abc.charAt(i);
        }
        return ' ';
    }

    private static int getFreq(String abc, char c){
        int count = 0;
        for(int i=0; i<abc.length(); i++){
            if(abc.charAt(i)==c) count++;
        }
        return count;
    }

    // with data structures - MAP
    private static char getFirstNonRepeatingCharacter2(String abc) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < abc.length(); i++) {
            map.put(abc.charAt(i), map.getOrDefault(abc.charAt(i), 0) + 1);
        }

        for (int i = 0; i < abc.length(); i++) {
            if (map.get(abc.charAt(i)) == 1) return abc.charAt(i);
        }

        return ' ';
    }

    // Same algorithm with hashmap - O(n) time complexity, 26 space complexity
    private static char getFirstNonRepeatingCharacter3(String abc) {
        int[] char_counts = new int[26];

        for(char c : abc.toCharArray()) char_counts[c-'a']++;

        for(char c : abc.toCharArray()) {
            if(char_counts[c-'a']==1) return c;
        }

        return ' ';
    }
}

class Man{
    public static void main(String[] args) {
        int  count = 0;
        for (int i = 1; i <= 30; i++) {
            if(i%3==0) count++;
        }
        System.out.println(count);
    }
}