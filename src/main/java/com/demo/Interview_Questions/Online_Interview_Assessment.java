package com.demo.Interview_Questions;

public class Online_Interview_Assessment {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}, 0,5)); //-1
        System.out.println(solution(new int[]{13,13,1,6}, 6,13)); //-1
        System.out.println(solution(new int[]{100,63,1,6,2,13}, 100,63)); //5
        System.out.println(solution(new int[]{6,42,11,7,1,42}, 7,42)); //4

        try{
            int a = 5/0;
        }
        catch (Exception e){
            //int b = 6/0;
        }
        finally {
            System.out.println("finally will be always gets executed");
        }

    }

    private static int solution(int[] arr, int X, int Y) {
        int nX = 0;
        int nY = 0;
        int result = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==X)
                nX++;
            else if(arr[i]==Y)
                nY++;
            if(nX==nY && nX!=0)
                result = i;
        }
        return result;
    }
}

class Finalize{

    public static void main(String[] args) {
        Finalize obj = new Finalize();
        //obj.finalize();
        //If Garbage Collector calls finalize method, while executing finalize method some unchecked exception rises
        // then JVM ignores that exception and rest of program will be continued normally.
        // So in this case the program termination is Normal and not abnormal.
        obj = null;

        System.gc();
        System.out.println("Main completes!");
    }



    @Override
    public void finalize(){
        System.out.println("finalize method overridden from object class");
        System.out.println(10/0);
    }
}