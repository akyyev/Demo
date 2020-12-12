package com.demo.OCA;

import I.love.Java.Language.AreYou;

import static java.util.Arrays.asList; // without ()
import static com.demo.OCA.Varargs.method;


public class Static_Imports {

    public static void main(String[] args) {
        java.util.List<Integer> ls = asList(1, 2, 3, 4);
        System.out.println(ls);
        method(1, 2, 3, 4, 5);

        StringBuilder s = new StringBuilder(new StringBuilder("a"));

        AreYou.main(new String[0]);

        E e= new E();
        System.out.println(e.m1(2));

    }
}

abstract class D{
    public int m1(int a){
        return 1;
    }
    public final int m2(){
        return 1;
    }
}

class E extends D{
    public int m1(double a){
        return 2;
    }


}

