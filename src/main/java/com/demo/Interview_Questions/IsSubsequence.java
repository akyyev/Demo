package com.demo.Interview_Questions;

public class IsSubsequence {
    

    public static boolean isSubsequence(String target, String word) {
        // can be solved using double pointers
        int i = 0, j = 0;

        while(i < target.length() && j < word.length()) {
            if(target.charAt(i) == word.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        // if all chars are seen in target it means it's a subsequence
        return i >= target.length();
    }

    public static void main(String[] args) {
        var sub = IsSubsequence.isSubsequence("abc", "aebbcdeee");
        System.out.println(sub);
    }
}
