package com.demo.day10_stringBuilder_formatting_genericClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generic_Classes {

    public static void main(String[] args) {
        // --------Before Java 5----------

        ArrayList ls = new ArrayList();

        ls.add("carrot");
        ls.add("banana");
        ls.add("squash");
        ls.add(1);

        String fruit = (String) ls.get(1);

        System.out.println(fruit);

        // ---------After Java 5 ----------
        List<String> strings = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Cow"));
        animals.add(new Animal("Sheep"));

        System.out.println(animals);

    }


}

class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: "+name;
    }
}