package data.algorithms.recursions;

import java.util.HashMap;
import java.util.Map;

public class Recursion {

    private Map<Integer, Integer> cache = new HashMap<>();
    
    public int getFib(int order) {
        // index: 0, 1, 2, 3, 4, 5, 6, 7,  ...
        // Fibs : 0, 1, 1, 2, 3, 5, 8, 13, ...
        // f(n) = f(n-1)+f(n-2)
        // base condition to terminate recursive calls
        if(cache.containsKey(order)) return cache.get(order);

        if(order==0) return 0;
        if(order==1) return 1;
        int result = getFib(order-1) + getFib(order-2);
        System.out.println("00001222222222");
        cache.put(order, result);
        return result;
    }

    public static int getFactorial(int number) {
        // base condition
        if(number == 1 || number == 0) return 1;
        return number * getFactorial(number-1);
    }
}

class TestApp {
    public static void main(String[] args) {
        System.out.println("Recursion.getFib(6) = " + new Recursion().getFib(6)); // 8
        System.out.println("Recursion.getFactorial(5) = " + Recursion.getFactorial(5)); // 120
    }
}
