package com.demo.Interview_Questions;

import java.util.List;

public class GetDay {
    public static void main(String[] args) {
        System.out.println(getDay("Thu", 4));
    }

    private static String getDay(String dayOfWeek, int daysLater){
                                //   0      1      2      3      4      5      6
        List<String> days =List.of("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        return days.get((days.indexOf(dayOfWeek)+daysLater) % 7);
    }
}
