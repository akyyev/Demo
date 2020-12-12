package com.demo.replits;

import java.util.Scanner;

public class Repl_62_Length_method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");

        String word = sc.nextLine();
        System.out.println("Length of the word: "+ word.length());

        //How can you find a length of a word without using length() method...
        int i=0;
        while(!word.substring(i).isEmpty()){
            i++;
        }

        System.out.println("Length of the word without using length() method: "+ i);
    }
}
