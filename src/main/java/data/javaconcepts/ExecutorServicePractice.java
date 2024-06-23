package data.javaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServicePractice {
    
    public static void main(String[] args) throws InterruptedException {
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executor.submit(new Task(i));
        }

        List<String> ls = Arrays.asList("1", "2", "3");
        ls.subList(0, 0);
        
        new ArrayList<Integer>().stream().filter(u-> u == 4).findFirst();
        executor.shutdown();
        System.out.println("All tasks are submitted...");

        executor.awaitTermination(10, TimeUnit.HOURS);
        System.out.println("All tasks are completed by 3 threads!");
    }


}

class Task implements Runnable {

    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting task: " + id);
        simpleWait(5000);
        System.out.println("Completed task: " + id);
    }
    
    private void simpleWait(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) { }
    }
        
}
