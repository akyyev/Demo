package com.demo.Interview_Questions;

import java.util.*;

public class Min_Window_Substring {

    public static void main(String[] args) {
        String str= "this is a test string",
                target = "tist";
        System.out.println(solution(str, target));


        String str2 = "geeksforgeeks", target2 = "ork";
        System.out.println(solution(str2, target2));

        String str3 = "ramp", target3 = "corn";
        System.out.println(solution(str3, target3));
    }

    public static String solution(String word, String target) {
        if(word.length()<target.length()) return  "no such window can exist";

        List<String> ls = new ArrayList<>();


        // Here we are creating all possible substrings
        // Then we add it to the list, if the substring contains all characters of the target.
        for(int i=0; i<word.length(); i++){
            for(int j=i; j<word.length(); j++){
                String temp = word.substring(i, j);
                if(checkContain(temp, target)) ls.add(temp);

            }
        }
        // We have list of substrings,
        // Now we need to sort them according to their length
        ls.sort((x, y) -> x.length() - y.length()>0? 1 : x.length()==y.length()? 0: -1);

        if(ls.size()==0) return "no such window can exist";
        return ls.get(0);

    }

    // Method returns freq-s of characters in the string
    private static Map<Character, Integer> getFreq(String word){
        Map<Character, Integer> freq = new HashMap<>();

        for(Character e: word.toCharArray()){
            freq.put(e, freq.getOrDefault(e, 0)+1);
        }
        return freq;
    }

    private static boolean checkContain(String subString, String target){
        Map<Character, Integer> targetFreq = getFreq(target);
        Map<Character, Integer> strMap = getFreq(subString);

        for(Map.Entry<Character, Integer> each: targetFreq.entrySet()){
            Character keyTarget = each.getKey();
            Integer valueTarget = each.getValue();

            if(strMap.get(keyTarget)==null || strMap.get(keyTarget)<valueTarget) return false;
        }

        return true;
    }


}
