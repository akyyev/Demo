package data.javaconcepts;

public class SynchronizedKeyword {
    

    public static void main(String[] args) throws InterruptedException {
        SynchronizedKeyword obj = new SynchronizedKeyword();
        obj.doWork();
    }


    private int count = 0;

    private void doWork() throws InterruptedException {
        
        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 2000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 2000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("COUNT: " + count);
    }

    private synchronized void increment() {
        count++;
    }
}
