package com.demo.day1;

public class Demo {


    public static void main(String[] args) {

        Person p = new Person("Aly", 2, false );

        // System.out.println(p.name); // name is unreachable because it's private field
        System.out.println(p.getName());

        System.out.println("-----------------------");

        Teacher t1 = new Teacher();
        t1.setName("Beza");
        t1.setAge(49);
        t1.setStudent(false);
        t1.major = "CS";

        System.out.println(t1);

        System.out.println("-----------------------");

        //Type name = value;
        Teacher t2 = new Teacher("Toyly", 18, false, "CS");
        t2.sapakOkadyar();

        System.out.println("-----------x------------");

        //LivingThings -> Person -> Teacher (Interfaces: Watandashlyk we Diller)

        Person t3 = new Teacher("Nury", 70, false, "Math");
        t3.salamBer("Toyly");
        t3.eat();
        t3.sleep();
        Person.mysteryMethod(); //this method is static method, it means class method, it's not related about objects.
        //t3.sapakOkadyar(); // Compile error, because there is no such method in Person class.

        System.out.println("----------x-------------");

        LivingThings t4 = new Teacher("X", 80, false, "Biology");
        t4.sleep();
        t4.eat();
        t4.run();


        System.out.println("-----------------------");
        //Polymorphism examples

        Teacher t5 = new Teacher("Toyly", 37, false, "Himiya");
        t5.run();
        t5.dilOwren("Arapca");
        t5.watandashlykAl("Ispaniya");
        t5.sleep();
        System.out.println(t5.vizaAlmakGerekmi());


        System.out.println("-----------------------");
        //Polymorphism examples


        Diller t6 = new Person("Bezirgen", 100, false);
        t6.inglisceSalamBer();
        t6.dilOwren("Inglisce");

        /**
         * Error -> compile error (String str = 100;) and runtime error (int a = 5/0)
         *
         * Relations: HAS A -- IS A
         *
         * IS A: INHERITANCE (CHILD - PARENT)
         * EX: child EXTENDS parent
         *
         *       SQUARE IS A RECTANGLE
         *       GOLE IS A SYGYR
         *       STUDENT IS A PERSON
         *       DOG IS A ANIMAL
         *       CAR IS A VEHICLE
         *       BIKE IS A VEHICLE
         *
         * HAS A:
         *       CAR HAS AN ENGINE
         *       ZOO HAS AN ANIMAL
         *
         * Shape is more abstract term. That's why we create Shape interface...
         * Rectangle is not that abstract, so it's a class. It can be parent for the Square class
         *
         *      Square(C)
         *      Rectangle(C)
         *      Shape (I)
         *
         * public class Square extends Rectangle implements Shape {      }
         *
         *
         *
         */

    }

}


// Return -type: void, int, String, boolean, so on...
// public       -> open to World
// protected    -> sub class and package
// default      -> only in package
// private      -> only in class




// Non - Static Method Syntax
// public void methodName(argumentler){ implementation }


// Static Method
// public static void methodName(argumentler){ implementation }


/**
 * Inheritance
 * Overloading
 * Overriding
 * Polymorphism
 * Abstract class
 * Abstract method
 * Interface
 * Encapsulation
 * Final Keyword
 *
 * Shekil -> Dortburcluk -> Kwadrat
 *      -> elips -> tegelek
 *
 **/