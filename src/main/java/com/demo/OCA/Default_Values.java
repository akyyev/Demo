package com.demo.OCA;

public class Default_Values {
    int i;
    char c;
    boolean b;
    float f;
    Integer integer;
    Boolean aBoolean;


    void printAll(){
        System.out.println("c :"+c);
        System.out.println("b :"+b);
        System.out.println("f :"+f);
        System.out.println("i :"+i);
        System.out.println("Integer :"+integer);
        System.out.println("Boolean : "+aBoolean);
    }

    public static void main(String[] args) {
        new Default_Values().printAll();
    }
}
