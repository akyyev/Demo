package com.demo.Interview_Questions;

import java.util.List;

public class FindMostRepeatingNumber {
    
    // Majority element repeats more than half of elements, 
    // otherwise this solution won't work

    
    // Majority element
    public int findMostRepeating(List<Integer> numbers) {
        Integer candidate = null;
        int count = 0;

        for(Integer num: numbers) {

            if(count == 0) {
                candidate = num;
            }

            // if(num == candidate) {
            //     count++;
            // }
            // else {
            //     count--;
            // }
            
            count += (num == candidate) ? 1 : -1;

        }
        return candidate;
    }

    public static void main(String[] args) {
        FindMostRepeatingNumber obj = new FindMostRepeatingNumber();

        var mostRepeated = obj.findMostRepeating(List.of(200, 4000, 5000, 6000, 1,1,1,2,2,2,3,2,2,2,2,1));
        System.out.println(mostRepeated);
    }
}
