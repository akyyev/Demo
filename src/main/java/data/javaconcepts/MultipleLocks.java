package data.javaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLocks {
    
    Object lock1 = new Object();
    Object lock2 = new Object();

    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    
    private void stageOne() {
        simpleWait(1);
        synchronized(lock1) {
            l1.add(new Random().nextInt());
        }
    }

    private void stageTwo() {
        simpleWait(1);
        synchronized(lock2) {
            l2.add(new Random().nextInt());
        }
    }

    private void process() {
        for(int i=0; i<1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    private void doWork() {
        var start = System.currentTimeMillis();

        Thread t1 = new Thread( () -> process());
        Thread t2 = new Thread( () -> process());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) { }

        System.out.println("Time taken: " + (System.currentTimeMillis() - start));
        System.out.println("l1 size: " + l1.size());
        System.out.println("l2 size: " + l2.size());
    }


    private void simpleWait(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) { }
    }


    public static void main(String[] args) {
        MultipleLocks obj = new MultipleLocks();
        obj.doWork();
    }
}
