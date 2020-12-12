package com.demo.OCA;

public class Constructors {
}

class C1 extends C2{
    public String name;

    public C1(){
        super(3); //
    }

    public final void m1(){
        System.out.println("Child can be final, but parent not");
    }
}

class C2{

    public String name;

    public void m1(){
        System.out.println("Parent Method");
    }
//    public C2(){
//
//    }
    public C2(int a){

    }
}