package com.demo.Interview_Questions;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String claimNumber = scan.nextLine();

        boolean c = claimNumber.matches("[A-Za-z0-9]");
        if (!c) {
        }

    }
}
class B extends A{
    int a = 10;
}
abstract class A extends Try{
    int a = 20;

}