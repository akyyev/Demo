package com.demo.Interview_Questions;

public class Immutable_Class {
    /**
     * All wrapper classes are immutable
     * String class is also immutable
     *
     * Rules: private final fields
     *       final class
     *       no setter method
     *       public Constructor
     *       getters available
     */

    public static void main(String[] args) {
        Contacts contacts = new Contacts("Mike", "mob1");
        System.out.println(contacts);
    }

}


final class Contacts {

    private final String name;
    private final String mobile;

    public Contacts(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName(){
        return name;
    }

    public String getMobile(){
        return mobile;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}