package com.demo.Interview_Questions;


import java.util.*;

public class Optimal_solution_a3b3c3d3 {

    public static void main(String[] args) {
        int num = 1000;
        int a, b, c, d;
        Map<Integer, Integer[]> map = new HashMap<>();

        OUTER: for(a=1; a<num; a++){
            for(b=1; b<num; b++){
                for(c=1; c<num; c++){
                    for(d=1; d<num; d++){
                        if(a*a*a+b*b*b==c*c*c+d*d*d && a!=b && a!=c && c!=d && a!=d){
                            System.out.println(a+" "+b+" "+c+" "+d);
                            System.out.println(a*a*a+" + "+b*b*b+" = "+c*c*c+" + "+d*d*d);
                            break OUTER;
                        }
                    }
                }
            }
        }


    }
}


class Another {
    public static void main(String args[]) {
        Map<Integer, Set<String>> list = new HashMap<Integer, Set<String>>();
        int n = (int) Math.pow(10, 2);
        int timecomplexity = 0;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                Set<String> l;
                timecomplexity++;
                int result = (int) (Math.pow(a, 3) + Math.pow(b, 3));
                if (list.containsKey(result)) {
                    l = list.get(result);
                    l.add(a + "," + b);
                    list.put(result, l);
                } else {
                    l = new TreeSet<String>();
                    l.add(a + "," + b);
                    list.put(result, l);
                }
            }
        }
        for (Map.Entry<Integer, Set<String>> entry : list.entrySet()) {
            Set<String> l = entry.getValue();
            System.out.print(entry.getKey() + ": ");
            for (String s : l) {
                System.out.print(s + " ; ");
            }
            System.out.println();
        }
        System.out.println(timecomplexity);
    }
}