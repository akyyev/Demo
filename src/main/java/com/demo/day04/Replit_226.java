package com.demo.day04;

public class Replit_226 {

    /**
     * Carpet class has following public double instance variables: width, length, unitPrice, totalPrice
     * and a public boolean variable isPersian. true if carpet object is Persian and false if it is not.
     * <p>
     * Add following constructors:
     * <p>
     * 1) No-Args constructor
     * -sets default values for the Carpet object
     * Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.
     * <p>
     * 2) 4-Args  Constructor:
     * - accepts width, length, unitPrice, isPersian  parameters and assigns values to public instance variables. try to use this. keyword
     * <p>
     * Set totalPrice as the width + length multiplied by the unitPrice.
     * <p>
     * if its a Persian carpet add 200 to totalPrice.
     * <p>
     * for example:
     * <p>
     * Carpet c = new Carpet();
     * System.out.println(c.totalPrice); // 200
     * <p>
     * <p>
     * Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
     * System.out.println(c2.totalPrice); // 80
     * the calculation:(20+20)*2
     * <p>
     * <p>
     * Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
     * System.out.println(c3.totalPrice); // 280
     */

    public static void main(String[] args) {
        Carpet c = new Carpet();
        System.out.println(c.totalPrice); // 200

        Carpet c2 = new Carpet(20.0, 20.0, 2.0, false);
        System.out.println(c2.totalPrice); // 80

        Carpet c3 = new Carpet(20.0, 20.0, 2.0, true);
        System.out.println(c3.totalPrice); // 280
    }


}

class Carpet {

    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;

    public Carpet() {
        //Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.
        width = 300;
        length = 300;
        totalPrice = 200;
        isPersian = false;
        unitPrice = 0;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        this.totalPrice = (width + length) * unitPrice + (isPersian ? 200 : 0);
    }
}