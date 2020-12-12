package com.demo.Interview_Questions.lambda;

// This is Functional interface (An interface has only single method)
interface Executable{
    int execute(int num);
}

interface StringExecutable{
    int execute(String name);
}

class Runner{
    public void run(Executable e){
        System.out.println("Executing code block ... ");
        int returnValue = e.execute(10);
        System.out.println("Returned value: "+ returnValue);
    }

    public void run(StringExecutable e){
        System.out.println("Executing code block ... ");
        int returnValue = e.execute("John");
        System.out.println("Returned value: "+ returnValue);
    }

}
public class Introduction {

    public static void main(String[] args) {
        Runner runner = new Runner();

        System.out.println("------- without lambda (before java 8)--------");
        runner.run(new Executable() {
            @Override
            public int execute(int n) {
                System.out.println("Hello there!");
                return 7+n;
            }
        });

        System.out.println("---------- with lambda (after java 8)---------");
        //runner.run(()-> System.out.println("Hello there!\n"));

        runner.run((int param)-> {
            System.out.println("This is code passed in lambda expression");
            System.out.println("Hello there! ");
            return 8+param;
        });

        System.out.println("---------");
        //runner.run(param->8+param);
        runner.run((String n)->{
            System.out.println("Hello there! "+n);
            return 8;
        });

    }
}
