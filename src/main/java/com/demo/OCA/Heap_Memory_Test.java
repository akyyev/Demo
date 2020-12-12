package com.demo.OCA;

import java.math.BigInteger;

public class Heap_Memory_Test {

    static boolean b;

    public static final void main(String[] args) {
        int i=0;
        boolean c;
        Ebook ebook = new Ebook();
        System.out.println(ebook instanceof Object);

        double d = 3.2;
        float f = 2.3f;

        float e = (float) (d+f);

        short s1=10, s2=3;
        int s3=s1/s2;

        // byte-short-int-long-float-double
        //  8    16   32   64    32    64
        //max values
        //byte => 2^8/2-1 = 127
        //short => 2^16/2-1 = 131071
        byte bit = 127;
        short s4 = 32767;
        System.out.println("2^6 = "+(2*32));
        System.out.println(Math.pow(2,63));

        BigInteger bigInteger = BigInteger.valueOf(2);
        bigInteger = bigInteger.pow(63);

        System.out.println(bigInteger);

    }

    static {
        long x = 10; int y = 5;
        y *= x;
        System.out.println(y);

        int m =3;
        int n;

        m = n = 5;
        System.out.println(m);
        System.out.println(n);
        /**
         * Exclusive OR is only true if the operands are different.
         */
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        if(2>3){
            for(  ; ; ){
                System.out.println("infinite loop");
            }
        }
        int[][] arr2 = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        Dashky:for(int[] arr : arr2){
            Icki: for(int each: arr){
                System.out.print(each+"\t");
            }
            System.out.println();
        }


        System.out.println("------------");
        System.out.println(5==5.0);
        System.out.println(5.0==5.0001);
        System.out.println("------------");

        int a = 4;
        final int b = 5;

        switch (a){
            default:
                System.out.println("3");
                break;
            case b:
                System.out.println("1");
                break;
            case 4:
                System.out.println("4");
                break;

        }
    }
}
