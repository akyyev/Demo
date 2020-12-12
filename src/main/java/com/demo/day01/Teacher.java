package com.demo.day01;

public class Teacher extends Person {

    String major;

    public Teacher(String name, int age, boolean isStudent, String major){
        super(name, age, isStudent);
        this.major = major;
    }

    public Teacher(){

    }

    @Override
    public String toString(){
        return "Ady: "+ super.getName()+"\nYas: "+super.getAge()+"\nStudentmi? "+super.getStudentInfo()+"\nSpesialnost: "+major;
    }


    @Override
    public void salamBer(String name){
        System.out.println(super.getName()+" salam beryar, hormatlayar. Kime: "+name);
        System.out.println("Yagdaylarynyz gowumeeeee?");
    }

    public void sapakOkadyar(){
        System.out.println(super.getName()+" mugallym sapak okadyar");
    }



}
