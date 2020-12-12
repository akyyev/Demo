package com.demo.OCA;

public class Ebook extends Book{
    public void readBook(){
        System.out.println("read e-book");
    }

    //we have to implement download() method otherwise compile error
    @Override
    public void download() {

    }
}

interface Downloadable{
    public void download();
}

interface Readable extends Downloadable{
    public void readBook();
}

abstract class Book implements Readable{
    public void readBook(){
        System.out.println("Read book");
    }
}
final class A1{
    public A1(){}
}
class A2{
    private static int i;
    public A2(){}
}

abstract class A3{
    private static int i;
    public void doStuff(){

    }
    public A3(){}
}

class A4{
    protected static final int i=10;//we need to initialize right away...
    public A4(){}

    public static void main(String[] args) {
        final int a;//no need to initialize here
    }
}
