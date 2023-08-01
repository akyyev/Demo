package data.algorithms.recursions;

public class Recursion {

    public static int getFib(int order) {
        // index: 0, 1, 2, 3, 4, 5, 6, 7,  ...
        // Fibs : 0, 1, 1, 2, 3, 5, 8, 13, ...
        // f(n) = f(n-1)+f(n-2)
        // base condition to terminate recursive calls
        if(order==0) return 0;
        if(order==1) return 1;
        return getFib(order-1) + getFib(order-2);
    }

    public static int getFactorial(int number) {
        // base condition
        if(number == 1 || number == 0) return 1;
        return number * getFactorial(number-1);
    }
}

class TestApp {
    public static void main(String[] args) {
        System.out.println("Recursion.getFib(6) = " + Recursion.getFib(6)); // 8
        System.out.println("Recursion.getFactorial(5) = " + Recursion.getFactorial(5)); // 120
    }
}
