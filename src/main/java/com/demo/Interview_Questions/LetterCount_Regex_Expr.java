package com.demo.Interview_Questions;





public class LetterCount_Regex_Expr {
    /**
     *  How to find how many letter has your resume
     *  To learn more: https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
     */

    public static void main(String[] args) {
        System.out.println(countLetters("I love Java Language!"));//17



        String str = "This is my small example string which I'm going to use for pattern matching.";
        System.out.println(str.matches("\\w.*")); //


        String[] splitString = str.split("\\s+");
        System.out.println(splitString.length);// should be 14
        for (String string : splitString) {
            System.out.println(string);
        }
        // replace all whitespace with underscore
        System.out.println(str.replaceAll("\\s+", "_"));


    }

    public static int countLetters(String str){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).matches("[a-zA-Z]")) count++;
        }
        return count;
    }
}
