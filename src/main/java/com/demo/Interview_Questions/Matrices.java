package com.demo.Interview_Questions;

public class Matrices {

    public static void main(String[] args) {
        int[][] numbers = new int[][]{{1, 2, 3}, {4,5,6}, {7,8,9}};

        traverseMatrixSpirally(numbers);
    }


    private static void traverseMatrixSpirally(int[][] arr) {
        int i, r=0, c=0;

        int last_row = arr.length-1;
        int last_col = arr[0].length-1;

        while (r<=last_row && c<=last_col){

            for(i=c; i<=last_col; i++){
                System.out.print(arr[r][i]+" ");
            }
            r++;

            for(i=r; i<=last_row; i++){
                System.out.print(arr[i][last_col]+" ");
            }
            last_col--;

            if(r<=last_row){
                for(i=last_col; i>=c; i--){
                    System.out.print(arr[last_row][i]+" ");
                }
                last_row--;
            }

            if(c<=last_col){
                for(i=last_row; i>=r; i--){
                    System.out.print(arr[i][c]+" ");
                }
                c++;
            }
        }
    }
}
