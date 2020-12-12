package com.demo.Interview_Questions.lambda;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Permutations_with_lambda {

    public static void main(String[] args) {
        String str = "ABCD";

        permutation(str).forEach(System.out::println);
    }

    private static Stream<String> permutation(String str){
        if(str.isEmpty()) return Stream.of("");
        return IntStream.range(0, str.length())
                .boxed()
                .flatMap(i->permutation(str.substring(0,i)+str.substring(i+1))
                .map(x->str.charAt(i)+x));
    }

}
