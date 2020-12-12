package com.demo.day08_oop;

public class OuterClass {


    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.inner();

    }

    private void inner(){
        class InnerClass{
            private void greeting(){
                System.out.println("Hello");
            }
        }

        InnerClass inn = new InnerClass();
        inn.greeting();
        OuterClass.Inner2 obj = new OuterClass.Inner2();
        obj.greeting2();
    }

    static class Inner2{
        private void greeting2(){
            System.out.println("halo, hi :)");
        }
    }
}
