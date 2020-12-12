package com.demo.Interview_Questions;

import java.util.HashMap;

public class RemoveCharToMakeBalloon {

    public static void main(String[] args) {
        RemoveCharToMakeBalloon rm = new RemoveCharToMakeBalloon();
        System.out.println(rm.solution("BALLOONX"));
    }

    private int solution(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char e: chars){
            map.put(e, map.getOrDefault(e, 0)+1);
        }



        return 0;
    }


}
