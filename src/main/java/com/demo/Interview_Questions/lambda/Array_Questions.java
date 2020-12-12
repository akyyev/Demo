package com.demo.Interview_Questions.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//generics functional interface
// T is return type
// E is parameter type
interface Array_op_interface<T, E> {
    T function(E e);
}

public class Array_Questions {
    public static void main(String[] args) {
        int[] intArr = {1, 50, 2, 7, 8, 10};
        String[] strArr = {"Ali", "John", "Joe", "Adam"};

        System.out.println(changeFirstWithSecondChar.function(strArr));
        System.out.println(max.function(intArr));

        System.out.println(secondMax(intArr));
        System.out.println(ascending.function(intArr));

        String name = "John Doe";
        System.out.println(reverse.function(name));
    }

    private static Array_op_interface<List<String>, String[]> changeFirstWithSecondChar = str ->
    {
        return Arrays.stream(str)
                .map(x->""+x.charAt(1)+x.charAt(0)+x.substring(2))
                .collect(Collectors.toList());
    };

    /**
     * To get first maximum
     */
    private static Array_op_interface<Integer, int[]> max = intArr ->{
        return Arrays.stream(intArr)
                .max()
                .getAsInt();
    };

    private static int secondMax(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .sorted((x,y)->y.compareTo(x))
                .collect(Collectors.toList())
                .get(1);
    }

    private static Array_op_interface<List<Integer>, int[]> ascending = intArr -> {
        return Arrays.stream(intArr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
    };

    private static Array_op_interface<String, String> reverse = str ->{
        return Arrays.stream(str.split(""))
                .reduce("", (a,b)->b+a);
    };


}
