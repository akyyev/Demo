package com.demo.OCA;

public class Tester {

    public final static int a;
    private final String b;
    private final static String name;

    {
        b="ABAB";
    }

    static {
        a=3;
        final int b;
        name = "as";
        b=2;
        //main(new String[0]);
    }

    public static void main(String[] args) {
        Varargs.main(new String[0]);
        Arrays_Example.main(new String[0]);



    }
}
