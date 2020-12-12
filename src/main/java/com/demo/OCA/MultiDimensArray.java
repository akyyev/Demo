package com.demo.OCA;

public class MultiDimensArray {

    public static void main(String[] args) {

        String [][] chs = new String[2][];

            chs[0] = new String[2];
            chs[1] = new String[5];

        int i=97;

        chs[1][2]="almaz";



        // {     {great almaz, 98 },     {99,100,e,f,g}         }

        ///{  a, b,c,d,e  }
        // a = {97,98}
        // b= {99,100,101,102,103}
        //c = {104,105}
        //d={106, 107}
        //e={108,109}

        for(int a=0; a<2; a++) {
            for(int b=0; b<2; b++) {
                chs[a][b]=""+i;
                i++;
            }
        }
        System.out.println("---after for loop--"+chs[0][0]);

        chs[0][0]="Great ALmaz";

        System.out.println("---after reassigning--"+chs[0][0]);


        for(int a=0; a<2; a++) {
            for(int b=0; b<chs[a].length; b++) {
                System.out.print(chs[a][b]+" ");
            }
        }System.out.println();



    }


}
