package com.demo.Interview_Questions.att_java_dev;

import java.util.*;

public class Interview {
//    Input: mary army Army Mary lemon Lemon Melon melon room plate

    public static void main(String[] args) {
        String input = "mary army Army Mary lemon melon lemon Melon room plate";
        input = "melon Army Mary lemon army ramy melon yram tom moto moot omto";
        new Interview().printFrequency(input);

        //For given input print out the frequency
        //then print number of matching anagram words to the word.

        // For example: input = "mary army Army Mary lemon melon lemon Melon room plate";
        // mary 2               --> Mary repeats twice
        // mary anagram - 2     --> and there are 2 anagrams (army & Army)
        // lemon 2
        // lemon anagram 2
        // room 1
        // room anagram 0
        // plate 1
        // plate anagram 0

    }

    public String getAnagramAvailable(Set<String> ls, String target){

        for(String each: ls){
            if(areAnagram(each, target) && !each.equals(target)) return each;
        }
        return "";
    }

    public void printFrequency(String input){

        String[] words = input.toLowerCase().split(" ");

        Map<String, Integer> freq = new HashMap<>();
        Map<String, List<String>> anagramsMap = new LinkedHashMap<>();
        Map<String, String> anagToKey = new HashMap<>();

        System.out.println(Arrays.toString(words));

        String target = words[0];

        for(String word: words){
            freq.put(word, freq.getOrDefault(word, 0)+1);

            String possibleAnagram = getAnagramAvailable(anagramsMap.keySet(), word);

            if(!anagramsMap.containsKey(target)){
                anagramsMap.put(target, new ArrayList<>());

            } else if (possibleAnagram.length()>0){
                anagramsMap.get(possibleAnagram).add(word);
                anagToKey.put(word, possibleAnagram);
            }
            else if(target.equals(word)||areAnagram(target, word)){
                // Adding word to the corresponding map key value list
                anagramsMap.get(target).add(word);

                anagToKey.put(word, target);

            } else if(anagToKey.getOrDefault(word, "").length()>0) {
                target = anagToKey.get(word);
                anagramsMap.get(anagToKey.get(word)).add(word);
            }
            else {
                target=word;
                if(!anagramsMap.containsKey(target)){
                    anagramsMap.put(target, new ArrayList<>());
                } else {
                    anagramsMap.get(target).add(word);
                    anagToKey.put(word, target);
                }
            }
        }

        for(String each: anagramsMap.keySet()){
            System.out.println(each+" "+freq.get(each));
            System.out.println(each+" anagram "+(anagramsMap.get(each).size()-freq.get(each)+1));
        }

    }





    public boolean areAnagram(String word1, String word2){
        char[] charFromWord1 = word1.toCharArray();
        char[] charFromWord2  = word2.toCharArray();
        Arrays.sort(charFromWord1);
        Arrays.sort(charFromWord2);
        return Arrays.equals(charFromWord1, charFromWord2);
    }

}






