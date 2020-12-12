package com.demo.OCA;

import com.demo.day3_exceptions.Comparing_Class_Objects;

import java.sql.Date;
import java.util.List;
import java.util.Random;
//import java.sql.Date; //complains because we already have one


public class String_main {

    public static void main(String[] args) {

        java.sql.Date date;

        double b=5;
        main(b);
    }

    //1. If there is matching one it executes right away with same type
    //2. byte- short- int -long -float -double
    //3. first it checks if there is matching primitives or larger primitives then wrapper classes



//    public static void main(int args) {
//        System.out.println("int");
//    }
    public static void main(short args) {
        System.out.println("short");
    }
    public static void main(byte args) {
        System.out.println("byte");
    }
//    public static void main(long args) {
//        System.out.println("long");
//    }

    public static void main(double args) {
        System.out.println("double");
    }

    public static void main(Byte args) {
        System.out.println("Byte wrapper class");
    }


    public static void main(Integer args) {
        System.out.println("integer wrapper class");
    }

    public static void main(Long args) {
        System.out.println("long wrapper class");
    }

    public static void main(Short args) {
        System.out.println("short wrapper class");
    }

}


interface HasTail {  int getTailLength(); }
abstract class Puma implements HasTail {
    public int getTailLength() {return 4;}

    public static void main(String[] args) {

        int x = 5, j = 0;

        for(int i=0; i<3; ){
            do{
                i++; x++;
                if(x>10) break;
                x+=4;
                j++;
            } while(j <= 2);
        }


        System.out.println(x);
    }
}


class Chicken{

    String name = "Chick";
    String lastName = "en Chick";
    String fullName = name+lastName;

    public static void main(String...args) {
        //HenHouse henHouse = new Chicken();
        Random r = new Random();
        System.out.println(new Chicken().Chicken());
        System.out.println(new Chicken().fullName);

    }
    public  Chicken(){
        System.out.println("Constructor");
    }
    public String Chicken(){
        return "Just a method";
    }

}
interface HenHouse{
    int a=11; //by default public and static
    public  java.util.List<Chicken> getChicken();

    public static void main(String[] args) {
        System.out.println(a);
    }
}