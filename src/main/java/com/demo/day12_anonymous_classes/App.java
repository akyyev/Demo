package com.demo.day12_anonymous_classes;

public class App {
    public static void main(String[] args) {

        //          Here is anonymous class which has no name, but it's subclass of Machine class
        Machine m1 = new Machine(){
            @Override
            public void start() {
                System.out.println("Camera snapping...");
            }
        };

        m1.start();

        // Here is another example
        // Plant p = new Plant(); // Compile error, cuz instantiation of an interface. But we can create
        // anonymous class that implements Plant interface
        Plant p = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant is growing...");
            }
        };

        Plant p2 = () -> System.out.println("Hello using Lambda expression, again it's also anonymous class");

        p.grow();
        p2.grow();

    }
}

class Machine{
    public void start(){
        System.out.println("Starting machine...");
    }
}

interface Plant{
    public void grow();
}