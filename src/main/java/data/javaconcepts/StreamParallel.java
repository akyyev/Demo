package data.javaconcepts;

import java.util.stream.LongStream;

public class StreamParallel {
    
    public static void main(String[] args) {
        var time1 = System.currentTimeMillis();
        var sum = LongStream.rangeClosed(0, 100_000_000).sum();
        
        System.out.println("Sequential sum: " + sum + " in " + (System.currentTimeMillis() - time1));


        var time2 = System.currentTimeMillis();
        var sum2 = LongStream.rangeClosed(0, 100_000_000).parallel().sum();
        System.out.println("Parallel sum: " + sum2 + " in " + (System.currentTimeMillis() - time2));

    }
}
