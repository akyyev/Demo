package com.demo.day01;

public class Person extends LivingThings implements Watandashlyk, Diller {

    //1. attributes
    // => instance variables -->  name, age, isStudent, ... (NOT SHARED)
            private String name;
            private int age;
            private boolean isStudent;
    // => static variables (CLASS Variables) --> counter (SHARED PROPERTIES)
            static int counter;

    //Getter for reading the private field and returning the info (Public)
    public String getName(){
        return this.name;
    }
    //Setter for writing (Public), to update field with new value.
    public void setName(String name){
        this.name = name;
    }

    //Getter, Setter --> age , isStudent
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean getStudentInfo(){
        return isStudent;
    }

    public void setStudent(boolean isStudent){
        this.isStudent = isStudent;
    }




    //2. constructors -> (Similar like methods, but NO RETURN TYPE) and (ConstructorName = ClassName)
    public Person(){ //default constructor
        name = "Myrat";
        age = 45;
        isStudent = false;
        counter++;
    }

    public Person(String theName, int theAge, boolean isStudent){  //overloading constructor
        name = theName;
        age = theAge;
        this.isStudent = isStudent;
        counter++;
    }

    //access specifier -  return type - methodName(parameters){}
    //                  |      method signature   |
    //protected           void          salamber    (    )
    //private              int          count
    //default           String          getName
    //public            WebDriver       getDriver


    //overloading --> same method signature different parameters, in the same class, happens during compile time
    //overriding  --> same method signature + same parameters... in sub-class,  happens during runtime



    //3. behaviors -- methods
    @Override
    public void eat(){
        System.out.println(name +" nahar iyyar.");
    }


    public void salamBer(String name){
        System.out.println(this.name+" salam beryar. Kime: "+name);
    }

    public static void mysteryMethod(){
        System.out.println("This is a static method");
        System.out.println("Mystery person is arrived");
        counter++;
    }



    //toString method to print out every instance (obj) directly
    public String toString(){
        return "Ady: "+ name+"\nYas: "+age+"\nStudentmi? "+isStudent;
    }


    @Override
    public void run(){
        System.out.println(name+" is running");
    }

    public static void main(String[] args) {

        Person p1 = new Person();  //created p1 using default constructor
        p1.name = "Toyly";
        p1.isStudent = false;
        p1.age = 18;

        Person p2 = new Person("Bezirgen", 17, true);
        Person p3 = new Person();

        //Static variables are called with className.
        System.out.println(Person.counter);

        p2.salamBer("Bagtyyar");
        p1.salamBer(p2.name);

        Person.mysteryMethod();
        System.out.println(Person.counter); //4


        int a = 5;
        int b = 5;


        String s1  = "beza";
        String s2 = "Beza".toLowerCase();

        System.out.println(s1==s2);  // == -> both location and value comparison
                                    // .equals() -> only value comparison
        String s3 = new String("abc");
        String s4 = new String("abc");
    }


    @Override
    public void inglisceSalamBer() {
        System.out.println(name+" is saying Hello!");
    }

    @Override
    public void dilOwren(String dil) {
        System.out.println(name+" "+dil+"ini owrenyar.");
    }

    @Override
    public void watandashlykAl(String yurdyng) {
        System.out.println(name+ " "+yurdyng+ "yn watandashlygyny aldy.");
    }

    @Override
    public void watandashlykCyk(String yurtdan) {
        System.out.println(name+ " "+yurtdan+ "yn watandashlygyndan cykdy.");
    }

    @Override
    public boolean vizaAlmakGerekmi() {
        return name.charAt(0)=='t';
    }
}

