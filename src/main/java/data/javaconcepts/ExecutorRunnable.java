package data.javaconcepts;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class ExecutorRunnable {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable runnable = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": Finished executing at: " + LocalDateTime.now());
        };

        ExecutorService executor = Executors.newFixedThreadPool(10);
        System.out.println("First Examnple - executing task with execute() method.");

        executor.execute(runnable);
        
        System.out.println("Second Examnple - executing task with submit() method.");

        Future<String> future = executor.submit(runnable, "COMPLETED");

        while(!future.isDone()) {
            System.out.println("The method return value: " + future.get());
        }

        executor.shutdown();
    }
}
