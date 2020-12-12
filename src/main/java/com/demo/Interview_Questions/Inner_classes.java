package com.demo.Interview_Questions;


public class Inner_classes {

    private int x = 2;
    protected int y = 3;
    private static int x1 = 4;
    protected static int x2 = 5;

    public static void main(String[] args) {
        //these variables are local
        //and when we call go() method it will get values from instance variables
        int x = 6;
        int y = 7;
        int x1 = 8;
        int x2 = 9;

        new Inner_classes().new Inner().go();
    }

    class Inner{
        void go() {
            System.out.println(x + " " + y + " " + x1+" " + x2);
        }

    }
}
