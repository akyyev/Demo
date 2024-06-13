package data.javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

import lombok.ToString;

@ToString
public class BoundCollection {
    
    private final Semaphore semaphore;

    private List<Integer> arrList;

    public BoundCollection(int limit) {
        semaphore = new Semaphore(limit);
        this.arrList = Collections.synchronizedList(new ArrayList<>());
    }

    public boolean add(Integer i){
        boolean added = false;
        try {
            semaphore.acquire(); // reduces permit count by 1;
            added = arrList.add(i);
        } catch (InterruptedException e) {}
        finally {
            if(!added){
                semaphore.release(); // if not added then there is no meaning of keeping the permit
            }
        }
        return added;
    }

    public boolean remove(Integer i) {
        boolean removed = arrList.remove(i);
        if(removed){
            semaphore.release(); // If the element is successfully removed, 
            //release a permit because it indicates that one spot is now available.
        }
        return removed;
    }

}

class TestSemaphore {

    public static void main(String[] args) throws InterruptedException {
        final BoundCollection collection = new BoundCollection(10);

        System.out.println(collection);
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                if(collection.add(i))
                    System.out.println(Thread.currentThread().getName() + " adding value: " + i);
            }
        }).start();;

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            for (int i = 0; i < 20; i++) {
                if(collection.remove(i))
                    System.out.println(Thread.currentThread().getName() + " removing value: " + i);
            }
        }).start();

        Thread.sleep(1400);
        System.out.println(collection);
    }
}