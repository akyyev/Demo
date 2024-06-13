package data.javaconcepts;

public class FastFoodRestaurant {
    
    private String lastClientName;
    private static int burgersSold;


    public String getLastClientName() {
        return this.lastClientName;
    }

    public int getBurgersSold() {
        return FastFoodRestaurant.burgersSold;
    }

    // not optimal
    /** public synchronized void buyBurger(String clientName) {
        alongRunningProcess();
        this.clientName = clientName;
        burgersSold++;
        System.out.println(clientName + " bought a burger.");
    } */

    public void buyBurger(String clientName) {
        alongRunningProcess();
        System.out.println(clientName + " bought a burger.");

        synchronized (this) {
            this.lastClientName = clientName;
            burgersSold++;
        }
    }

    private void alongRunningProcess() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class TestSync {
    public static void main(String[] args) throws InterruptedException {
        FastFoodRestaurant restaurant = new FastFoodRestaurant();  

        var t1 = new Thread(() -> restaurant.buyBurger("AMY"));
        var t2 = new Thread(() -> restaurant.buyBurger("BOB"));
        var t3 = new Thread(() -> restaurant.buyBurger("CHARLIE"));
        var t4 = new Thread(() -> restaurant.buyBurger("DAVID"));


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();  
        t4.join();

        System.out.println(restaurant.getBurgersSold());
        System.out.println(restaurant.getLastClientName());
        
    }
}
