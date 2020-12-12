package com.demo.day2;

import java.util.Arrays;
import java.util.List;

public class HWK {

    public static void main(String[] args) {

        Product p1 = new Product("Book", 10);
        Product p2 = new Product("Book", 10);

        System.out.println(p1.equals(p2));


        Product p3 = new Product("Pen", 5);
        Product p4 = new Product("Pencil", 17);
        Product p5 = new Product("Eraser", 1);
        Product p6 = new Product("Map", 15);

        List<Product>  myProducts = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Store myStore = new Store(myProducts);

        System.out.println(myStore.getMaxPriceProduct().getName());
        System.out.println(myStore.getTotalPrice());

        System.out.println("------------------");
        System.out.println("Avg price: "+myStore.avgPriceInMyStore());


        System.out.println("All products: "+myProducts);
        System.out.println(myStore.getProductsMoreExpensiveThanAvg());

    }
}
