package data.algorithms.recursions;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Recursion {

    private Map<Integer, BigInteger> cache = new HashMap<>();
    
    public BigInteger getFib(int order) {
        // index: 0, 1, 2, 3, 4, 5, 6, 7,  ...
        // Fibs : 0, 1, 1, 2, 3, 5, 8, 13, ...
        // f(n) = f(n-1)+f(n-2)
        // base condition to terminate recursive calls
       if(cache.containsKey(order)) return cache.get(order);

        if(order==0) return BigInteger.ZERO;
        if(order==1) return BigInteger.ONE;
        BigInteger result = getFib(order-1).add(getFib(order-2));
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
        System.out.println("Recursion.getFib(50) = " + new Recursion().getFib(60)); // 12586269025 with memoization using HashMap
        System.out.println("Recursion.getFactorial(5) = " + Recursion.getFactorial(5)); // 120
    }
}
