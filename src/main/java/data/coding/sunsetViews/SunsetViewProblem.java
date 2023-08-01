package data.coding.sunsetViews;

import java.util.List;
import java.util.Stack;

public class SunsetViewProblem {

    public static void main(String[] args) {
        System.out.println("sunsetViews(new int[] {}, \"EAST\") = " + sunsetViews(new int[]{3,5,4,4,3,1,3,2}, "EAST"));
        System.out.println("sunsetViews(new int[] {}, \"WEST\") = " + sunsetViews(new int[]{3,5,4,4,3,1,3,2}, "WEST"));
    }

    private static List<Integer> sunsetViews(int[] buildings, String direction) {
        var stack = new Stack<Integer>(); // stack to store indices of buildings to be returned
        if(direction.equals("EAST")) {
            for(var i=buildings.length-1; i>=0; i--) {
                if(stack.isEmpty()) stack.push(i);
                else if(buildings[stack.peek()] < buildings[i]) {
                    stack.push(i);
                }
            }
        } else if(direction.equals("WEST")) {
            for(var i=0; i<buildings.length; i++) {
                if(stack.isEmpty()) stack.push(i);
                else if(buildings[stack.peek()] < buildings[i]) {
                    stack.push(i);
                }
            }
        }

        return stack;
    }
}
