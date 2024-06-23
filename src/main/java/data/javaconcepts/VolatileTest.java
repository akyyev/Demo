package data.javaconcepts;

public class VolatileTest {
    
    // here volatile keyword makes the field un-cachable
    // without this keyword second thread will get flag value as false, meaning gets cached value
    // and !false evalutes to true, so it will keep increasing i's value in side the loop
    // and never terminates.
    public static volatile boolean flag = false;


    public static void main(String[] args) {
        
        // thread modifies value of flag after printing some numbers
        var t1 = new Thread(() -> {
            for (int i = 0; i < 400; i++) {
                System.out.println("Value of i: " + i);
            }
            flag = true;
        });

        // here second thread count numbers while flag is not false,
        // once it's true it terminates by printing the count...
        var t2 = new Thread(() -> {
            int i = 1;

            while(!flag) {
                ++i;
            }
            System.out.println("The value of i in the second thread is : " + i);
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}
    }
}
