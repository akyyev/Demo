package com.demo.OCA;

public class Search_Sample {

    public int a=5;

    Search_Sample(){

    }

    public static void searchFrom2DArray(int num, int[][] arr){
        int posX = -1;
        int posY = -1;

        OUTER_LOOP:for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                if(arr[i][j]==num){
                    posX = i;
                    posY = j;
                    break OUTER_LOOP;
                }
            }
        }
        System.out.println("Value "+ num+" found at ("+posX+", "+posY+")");
    }

    public static void main(String[] args) {
        int [][] arr = {
                            {1,2,3,4},
                            {5,6,7},
                            {8}
                        };
        searchFrom2DArray(5, arr);


        StringBuilder sb = new StringBuilder("A");
        sb.append("B");
        StringBuilder sb2 = sb.append("C");

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb==sb2);

        boolean bool = false;
        System.out.println(bool = true); //true

        System.out.println(sb.capacity()); //17

        String literal = "ABC";
        System.out.println(literal==sb.toString()); //false


    }
}
