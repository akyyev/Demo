package com.demo.day10_stringBuilder_formatting_genericClasses;

public class StringBuilderPractice {

    public static void main(String[] args) {

        //Inefficient, consumes more memory
        String text = "";

        text += "My name is";
        text += " ";
        text += "Bob";

        System.out.println(text);


        // Efficient way
        StringBuilder mySb = new StringBuilder("");

        mySb.append("My name is")
                .append(" ")
                .append("Bob");

        System.out.println(mySb.toString());


        // Comparison with
        // StringBuffer (synchronized-thread safe, means two threads can't call methods of this class simultaneously)
        // (takes more time comparing to StringBuilder-thread unsafe, async)
        // and String classes
        long startTime = System.currentTimeMillis();
        String str = new String("Java");
        for (int i=0; i<10000; i++){
            str += "Programming";
        }
        System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<1000000; i++){
            sb.append("Programming");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<1000000; i++){
            sb2.append("Programming");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");


    }
}
