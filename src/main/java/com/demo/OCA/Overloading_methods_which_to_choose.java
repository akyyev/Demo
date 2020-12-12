package com.demo.OCA;

import static java.lang.System.out;

public class Overloading_methods_which_to_choose {

    public static void main(String[] args) {
        //exact match -> wider one -> wrapper class

        method(1);                  //int, exact match
        method(1,2,3,4);           //varargs, exact match
        method((short) 3);              //int, wider one
//        method(new Short((short)3));   //Short, exact match
        //method(5f);                   //compile error, no match, no wider one (double), no wrapper class (Float),
        //But if we cast to double, it will find wrapper class...
        method((double) 5f);            //Double, wider one

    }

    public static void method(int a){
        System.out.println("int");
    }
    public static void method(long a){
        System.out.println("long");
    }

    public static void method(Integer a){
        System.out.println("Integer");
    }

    public static void method(int...a){
        System.out.println("varargs");
    }

    public static void method(Short a){
        System.out.println("Short");
    }

    public static void method(Double a){
        System.out.println("Double");
        out.println();
    }


    final static void me(){

    }
    static final String method3() {
        return null;
    }
}