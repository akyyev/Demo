package com.demo.day01;

import java.util.Arrays;

public class Replit {

    /**
     *
     */

    public static void main(String[] args) {

        String input = "-t--awd--b$c---a";
        char[] arr = new char[input.length()];

        for(int i=0; i<input.length();i++){
            boolean isLetter = Character.isLetter(input.charAt(i));
            if(isLetter){
                arr[input.length()-i]=input.charAt(i);
            }else{
                arr[i]= input.charAt(i);
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(reverseSpecial(input));
    }


    public static String reverseSpecial(String input){
        String lettersInReverseOrder="";

        for(int i=input.length()-1; i>=0; i--){
            boolean isLetter = Character.isLetter(input.charAt(i));
            if(isLetter){
                lettersInReverseOrder+=input.charAt(i);
            }
        }

        String exp ="";
        int c=0;
        for(int i=0; i<input.length(); i++){
            boolean isLetter = Character.isLetter(input.charAt(i));
            if(isLetter){
                exp+=lettersInReverseOrder.charAt(c);
                c++;
            }
            else{
                exp+=input.charAt(i);
            }
        }

        return exp;
    }


}
