package com.demo.day13_Pass_by_value;

public class App {

    public static void main(String[] args) {
        App app = new App();

        // -------------on primitives---------------
        int value = 7;
        System.out.println("1. Value is: "+value);

        // Here value of value variable is copied to the argument of show method
        app.show(value);

        // Still 7
        System.out.println("4. Value is: "+value);

        //--------how about Reference type ----------
        System.out.println();

        Person person = new Person("Bob");          // Memory address: m1
        System.out.println("1. Person is: "+person);       // Bob

        app.show(person);

        System.out.println("4. Person is: "+person);        // This person is still referencing to m1 so
                                                            // it will print Sue
    }

    public void show(int value){
        System.out.println("2. Value is: "+value);

        value = 8;
        System.out.println("3. Value is: "+value);
    }

    public void show(Person person){                    // Passing the copy address of m1
        System.out.println("2. Person is: "+person);    // Bob

        person.setName("Sue");                          // Here we are changing name on m1
        person = new Person("Mike");              // Now, person points different address m2

        System.out.println("3. Person is: "+person);     // Mike
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}