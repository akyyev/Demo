package com.demo.OCA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_Example {


    int age = 50;

    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5};
        String[] arr2 = new String[5]; //all values are default of Strings. So it's null
        short[] arr3 = new short[5]; //all 0
        String[] arr4 = arr2;
        System.out.println(arr3[0]); //0
        String[] newArr = arr2.clone();
        arr2[0]="A";

        System.out.println(Arrays.toString(newArr));//[null, null, null, null, null]
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr4));

        System.out.println("---------------------");
        Integer i = 50;
        Integer i2 = i;
        i2 = 100;
        System.out.println(i); //50
        System.out.println(i2); //100

        System.out.println("----------------------");
        Arrays_Example arrays_example = new Arrays_Example();
        Arrays_Example arrays_example1 = arrays_example;
        arrays_example1.age = 100;

        System.out.println(arrays_example.age);

    }
}
