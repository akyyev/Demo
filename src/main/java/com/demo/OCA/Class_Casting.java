package com.demo.OCA;
import  com.demo.Interview_Questions.Switch_zeros;
import static com.demo.Interview_Questions.Switch_zeros.pushZerosToEnd;
public class Class_Casting {

    public static void main(String[] args) {
        A a = new A();
        A c = new C();

        a = (A) c;

        //A b = (B) c;
        A b2 = (B) c;



       // b.test();
        b2.test();

    }
}

class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}

class C extends A{
    public void test(){
        System.out.println("C");
    }
}