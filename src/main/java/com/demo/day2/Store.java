package com.demo.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create a class called Product with encapsulated fields name, price and constructor
 *
 * override the .equals method coming from Object class :
 * Two products should be equal if they have the same fields value.
 * Practice Association: important
 *
 * create a class called Store
 * It has List<Product> as instance variable
 *
 * no arg constructor to initialize the list to empty ArrayList object
 *
 * 1 Arg constructor to accept List<Product>
 * First line of constructor should call nonath constructor to reuse initialization logic.
 *
 * Inside constructor AddAll Products user passed to the instance variable last.
 *
 * Create an instance void method called addProduct(Product p)
 *
 * Create an instance void method called removeProduct(Product p)
 *
 *
 * Create an instance void method called checkIfProductExist(Product p)
 *
 * Hint : just call list remove method, it will internally call .equal method to decide which one to remove
 *
 *
 * more methods : find and return max price product, Find sum.of all products
 *
 * Find list of products more than average
 */
public class Store {

    List<Product> productList;

    public Store(){
        productList = new ArrayList<>();
    }

    public Store(List<Product> products){
        productList = products;
    }

    //store --> productList = {}
    //store(book, galam, rucka) --> productList = {book, galam, rucka}

    //Create an instance void method called addProduct(Product p)
    public void addProduct(Product p){
        productList.add(p);
    }

    //Create an instance void method called removeProduct(Product p)
    public void removeProduct(Product p){
        productList.remove(p);
    }

    //Create an instance void method called checkIfProductExist(Product p)
    public boolean checkIfProductExist(Product p){
        System.out.println(productList.contains(p));
        return productList.contains(p);
    }


    //more methods : find and return max price product
    public Product getMaxPriceProduct(){
        Collections.sort(productList, Collections.reverseOrder());
        return productList.get(0);
    }

    //Find sum.of all products
    public double getTotalPrice(){
        double total = 0;
        for(Product each : productList){
            total +=each.getPrice();
        }
        return total;
    }

    public double avgPriceInMyStore(){
        return getTotalPrice() / productList.size();
    }

    //Find list of products more than average --> avg = 58/6  total / numOfProducts
    public List<Product> getProductsMoreExpensiveThanAvg(){
        double avg = avgPriceInMyStore();
        List<Product> expectedList = new ArrayList<>();

        for(Product each : productList){
            if(each.getPrice()>avg)  expectedList.add(each);
        }
        return expectedList;
    }


}
