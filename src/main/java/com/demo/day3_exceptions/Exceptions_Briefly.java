package com.demo.day3_exceptions;

import com.demo.day1.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions_Briefly {


    //Exceptions:
        // -- Checked
        //          Example: (Thread.sleep(), IO or Compile Time exceptions)
        // -- Unchecked (5/0) will appear on Runtime

    //Checked exceptions need to be handled right away
        // <- Try-catch-block,
        // <- Throws keyword

    public static void main(String[] args) throws InterruptedException{

        int a = 5;
        int b = 0;


        try{
            int c = a/b; // -> throws ArithmeticException //Runtime exception
            System.out.println(c);
        } catch(ArithmeticException e){
            System.out.println(a+" sanyny "+ b+ " sanyna bolmek bashartmady");
        }

        System.out.println("Salam Toyly ake");
//        try{
//            Thread.sleep(1000);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        sleep(1.5);
        System.out.println("Salam Beza dayy!");



        int number;

        Teacher t7 = null;
        try{
            t7.sapakOkadyar();
        }catch (NullPointerException e){
            System.out.println("gecdik sag aman!");
        }

        System.out.println("----------------------");


        try{
            int arr[]=new int[5];
            arr[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }finally {
            System.out.println("before rest of the code");
        }
        System.out.println("rest of the code");

}

    public static void sleep(int sekunt){
        try{
            Thread.sleep(1000*sekunt);
        }catch (InterruptedException m){
            m.printStackTrace();
        }
    }

    public static void sleep(double sekunt) throws InterruptedException{
            Thread.sleep((int)(1000*sekunt));
    }


}
