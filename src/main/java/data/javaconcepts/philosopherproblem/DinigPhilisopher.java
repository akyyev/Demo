package data.javaconcepts.philosopherproblem;

public class DinigPhilisopher {
    
    // 5 philosophers
    // 5 forks
    // each philopher has 2 state (eating or waiting for 2 forks to be available - thinking)
    // left philospher right
    // f1 p1 f2 p2 f3 p3 f4 p4 f5 p5

    static Object fork1 = new Object();
    static Object fork2 = new Object();
    static Object fork3 = new Object();
    static Object fork4 = new Object();
    static Object fork5 = new Object();

    static Philosopher p1 = new Philosopher(fork1, fork2);
    static Philosopher p2 = new Philosopher(fork2, fork3);
    static Philosopher p3 = new Philosopher(fork3, fork4);
    static Philosopher p4 = new Philosopher(fork4, fork5);
    static Philosopher p5 = new Philosopher(fork5, fork1);
    
    public static void main(String[] args) throws InterruptedException {
        new Thread(p1, "Philosopher1").start();
        Thread.sleep(100);

        new Thread(p2, "Philosopher2").start();
        Thread.sleep(100);

        new Thread(p3, "Philosopher3").start();
        Thread.sleep(100);

        new Thread(p4, "Philosopher4").start();
        Thread.sleep(100);

        new Thread(p5, "Philosopher5").start();
        Thread.sleep(100);
    


    }
}

class Philosopher implements Runnable{
    
    private Object leftFork;
    private Object rightFork;


    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (true) {
            doWork(System.currentTimeMillis() + " : Thinking...");
            synchronized (leftFork) {
                doWork(System.currentTimeMillis() + " : Picked up left fork!");
                synchronized (rightFork) {
                    doWork(System.currentTimeMillis() + " : Picked up right fork! Eating...");
                }
                doWork(System.currentTimeMillis() + " : Put down right fork");
            }
            doWork(System.currentTimeMillis() + " : Put down left fork, both are available.");
        }
    }

    private void doWork(String s) {
        System.out.println(String.format("Thread: %s, action: %s", Thread.currentThread().getName(), s));
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (Exception e) {}
    }
    
}