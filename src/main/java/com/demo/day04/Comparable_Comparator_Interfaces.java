package com.demo.day04;

import java.util.*;

public class Comparable_Comparator_Interfaces {

    /**
     * if sorting of objects needs to be based on natural order then use Comparable
     * whereas if you sorting needs to be done on attributes of different objects,
     * then use Comparator in Java.
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,200,150,300);

        Collections.sort(list);//ascending
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

        Person p1 = new Person("Beza", 25, 45.5);
        Person p2 = new Person("Toyly", 20, 50.0);
        Person p3 = new Person("Nury", 35, 60.5);
        Person p4 = new Person("X", 60, 70);

        List<Person> people = Arrays.asList(p1,p2,p3,p4);

        System.out.println("\n---------name sort using comparable interface---------");
        Collections.sort(people);//will sort according to name
        //people.forEach(person-> System.out.println(person));
        people.forEach(System.out::println);
//        for(Person each : people){
//            System.out.println(each);
//        }

        System.out.println("\n---------age sort using Comparator interface---------");
        Collections.sort(people, new CompareAccordingToAge());
        people.forEach(System.out::println);


        System.out.println("\n---------weight sort using Comparator interface---------");
        Collections.sort(people, new CompareAccordingToWeight());
        people.forEach(System.out::println);

    }

}

class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double weight;



    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    /**
     * Compares according to names of people
     * @param
     * @return
     */
    @Override
    public int compareTo(Person p) {
        return (this.name.compareTo(p.name)>0)? 1: -1;
//        return this.age-p.age>0? 1:-1;        //compares according to age
//        return this.weight-p.weight>0 ? 1: -1; //compares according to weight
    }

}


class CompareAccordingToAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge()>0? 1:-1;
    }
}

class CompareAccordingToWeight implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getWeight()-o2.getWeight()>0 ? 1: -1;
    }
}