package com.demo.Interview_Questions;

import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("Mike", 30); // will not be added to the set, cuz ages are same with p1
        Person p3 = new Person("John", 31);

        Set<Person> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return this.age-p.age>0? 1: this.age==p.age? 0: -1;
    }
}
