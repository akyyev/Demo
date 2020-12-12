package com.demo.OCA;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {
        //This is traditional way
        List<Animal> animals = new ArrayList<>(); // list of animals animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        //print(animals, new CheckIfHopper()); // pass class that does check

        print(animals, a -> ! a.canHop());


    }
//
//    private static void print(List<Animal> animals, CheckTrait checker) {
//        for (Animal animal : animals) {
//            if (checker.test(animal)) System.out.print(animal + " ");
//        }
//        System.out.println();
//    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) { if (checker.test(animal))
            System.out.print(animal + " "); }
        System.out.println();
    }

}
interface Predicate<T>{
    boolean test(T t);
}

interface CheckTrait{
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName; canHop = hopper; canSwim = swimmer;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
}
