package com.demo.Interview_Questions;

import org.testng.Assert;

public class Palindrome2 {
    public static void main(String[] args) {
        //            0123456789
        System.out.println(solution("rkmek"));
        System.out.println(solution("racecartl"));
        System.out.println(solution("abcba"));
        System.out.println(solution("abrbam"));
        System.out.println(solution("btypeepykt"));


        System.out.println(solution("abccbn"));

        Assert.assertEquals(solution("kayak"),"Str is Palindrome!");
        Assert.assertEquals(solution("abcbam"),"abcba");
        Assert.assertEquals(solution("kaaamaaa"),"aaamaaa");
        Assert.assertEquals(solution("racecar"),"Str is Palindrome!");
        Assert.assertEquals(solution("01234563210"),"012363210");
        //     i =2, j = 6 -> da fks pre
    }

    private static String solution(String str) {
        String temp;
        if(isPal(str)) {
            return "Str is Palindrome!";
        }

        for(int i=0; i<str.length(); i++){
            temp = str.substring(0, i)+str.substring(i+1);

            if(isPal(temp)) return temp;
        }

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                temp = str.substring(0, i)+str.substring(i+1, j)+str.substring(j+1);

                if(isPal(temp)) return temp;
            }
        }
        return "You can't make it palindrome by removing 2 chars";
    }


    public static boolean isPal(String str){
        int from=0, to=str.length()-1;

        while(from<to){
            if(str.charAt(from++)!=str.charAt(to--)) return false;
        }
        return true;
    }
}
