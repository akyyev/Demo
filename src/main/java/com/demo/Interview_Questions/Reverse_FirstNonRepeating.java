package com.demo.Interview_Questions;

public class Reverse_FirstNonRepeating {


    /**
     * 1. Task: String Reverse ( return method)
     * 2. Task : Implementation to find First Non Repeated Character in a given String after reversing
     *       Ex: Input = "street"
     *           Output should be "r"
     * @param args
     */
    public static void main(String[] args) {
        String str = "street";
        str = new StringBuilder(str).reverse().toString();

        String res = "";
        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)) count++;
            }
            if(count==1) res += str.charAt(i);
        }

        System.out.println(res.charAt(0));
    }
}
