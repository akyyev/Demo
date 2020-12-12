package com.demo.Interview_Questions;

public class Singleton_Class {

    public static void main(String[] args) {
        System.out.println(Singleton.getSingleInstance());
        System.out.println(Singleton.getSingleInstance());
        System.out.println(Singleton.getSingleInstance());

        System.out.println(NotSingleton.getInstance());
        System.out.println(NotSingleton.getInstance());
        System.out.println(NotSingleton.getInstance());


    }
}

class NotSingleton{
    private NotSingleton notSingleton;

    private NotSingleton(){
    }

    public static NotSingleton getInstance(){
        return new NotSingleton();
    }
}

class Singleton{

    private static Singleton s;

    private Singleton(){
    }

    public static Singleton getSingleInstance(){
        if(s==null){
            s = new Singleton();
        }
        return s;
    }
}
