package com.demo.Interview_Questions;

public class Task_14_permutation {

    public static void main(String[] args) {
        permutation("ABCDEFGHK");
    }


    public static void permutation(String input) {
        permutation("", input);
    }


    private static void permutation(String perm, String word) {
        //base case
        if (word.isEmpty()) {
            System.out.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
    }

}
