package data.javaconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lombok.Data;

@Data
public class BankTransfer {
    private double balance;
    private int id;
    private String accountName;
    final Lock lock = new ReentrantLock();

    public BankTransfer(int id, double balance, String accountName) {
        this.id = id;
        this.balance = balance;
        this.accountName = accountName;
    }

    public boolean withdraw(double amount) throws InterruptedException {
        if(this.lock.tryLock()) {
            Thread.sleep(100);
            balance -= amount;
            lock.unlock();
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) throws InterruptedException {
        if(this.lock.tryLock()) {
            Thread.sleep(100);
            balance += amount;
            lock.unlock();
            return true;
        }
        return false;
    }

    public boolean transfer(BankTransfer to, double amount) throws InterruptedException {
        if(withdraw(amount)) {
            System.out.println("Widthdrawing amount: " + amount + " from account: " + accountName);

            if(to.deposit(amount)) {
                System.out.println("Depositing amount: " + amount + " to account: " + to.accountName);
                return true;
            } else {
                System.out.println("Failed to acquire the both locks, refunding the money to account: " + accountName);
                while (!withdraw(amount)) {
                    continue;
                }
            }
        }
        return false;
    }

}

class TestTransfer {

    public static void main(String[] args) {
        BankTransfer studentAccount = new BankTransfer(1, 50_000, "StudentA");
        BankTransfer universityAccount = new BankTransfer(2, 100_000, "University");

        ExecutorService service = Executors.newFixedThreadPool(10);

        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " says :: Executing transfer");

            try {
                while (!studentAccount.transfer(universityAccount, 1_000)) {
                    Thread.sleep(1000);
                    continue;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " says transfer is successfull");
        });

        for (int i = 0; i < 20; i++) {
            service.submit(t);
        }

        service.shutdown();

        try {
            while (!service.awaitTermination(24L, TimeUnit.HOURS)) {
                System.out.println("Not Yet, still waiting for termination");
                
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ending balance student: " + studentAccount.getBalance());
        System.out.println("Ending balance university: " + universityAccount.getBalance());
    }
}

