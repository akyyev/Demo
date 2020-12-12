package com.demo.day2;

public class OOP extends SuperClass{

    String name="Beza";

//    void sum(int a, int b){
//        System.out.println(a+b);
//    }

//    void multiply(int a, int b){
//        System.out.println(a*b);
//    }

    private void salam(){
        System.out.println("-----------------");
        String name = "Baho";
        System.out.println(name); //baho
        System.out.println(this.name); //beza
        System.out.println(super.name); //super beza
        System.out.println("Salam Dunya!");
        this.salam2(); //privet
        super.salam2();//super privet
        System.out.println("-----------------");
    }

    //Fibonacci 1,1,2,3,5,8,13,21,34,55,...
    // 8=> 5, 3
        // 5 ==> 3,2
        // 3 ==> 2,1

    public static int fibo(int a){
        if(a==1) return 1;
        else if(a==0) return 0;
        else return fibo(a-1)+fibo(a-2);
    }



    //This. vs Super.
    // this.methodName --> will call methods that are in the same class
    // this.fieldName  --> will call fields that are in the same class

    // super.methodName --> will call methods that are in the super class (INHERITANCE IS MUST) (EXTENDS KEYWORD IS MUST)
    // super.fieldName  --> will call fields that are in the super class  (INHERITANCE IS MUST) (CHILD-PARENT RELATIONSHIP)


    @Override
    protected void salam2(){
        System.out.println("Privet");
    }


    public static void main(String[] args) {
        count = 3;

        //static method(main method) can only call static methods without creating an instance
        sum(5,6);

        SuperClass obj = new OOP();
        obj.multiply(5,6);
        //obj.salam();  --> we can't call this method, cuz reference type of obj is SuperClass.

        OOP obj2 = new OOP();
        obj2.salam();


        System.out.println(fibo(10));


    }

}


class SuperClass{

    String name = "Super Beza";

    //overridden method
    protected void salam2(){
        System.out.println("Super Privet");
    }


    static int count;

    static void sum(int a, int b){
        System.out.println(a+b);
    }

    void multiply(int a, int b){
        System.out.println(a*b);
    }

}

//private--> class private
//default--> package private


