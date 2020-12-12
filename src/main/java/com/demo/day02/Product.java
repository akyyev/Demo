package com.demo.day02;

public class Product implements Comparable<Product>{

    private String name;
    private double price;

    public Product(){

    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }


    /**
     * override the .equals method coming from Object class :
     * Two products should be equal if they have the same fields value.
     * Practice Association: important
     */


    public boolean equals(Product product){
        return product.name == this.name && product.price==this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return (o.getPrice()-this.getPrice()>=0) ? -1 : 0;
    }

    public String toString(){
        return name + " "+ price;
    }


}
