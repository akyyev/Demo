package com.demo.OCA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LocalDate_LocalTime {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        LocalDate localDate = LocalDate.of(2020, Month.MARCH, 8);
        LocalDate localDate1 = LocalDate.of(2020, 3, 8);
        System.out.println(localDate.equals(localDate1));

        LocalTime time1 = LocalTime.of(6, 15);                              // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30);                  // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);// + nanoseconds

        LocalDateTime localDateTime = LocalDateTime.of(2020,Month.MARCH, 8,14,30,0);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, time1);

        boolean b = localDate.getYear() == localDateTime1.getYear();

        /**
         * Be careful constructors are private.
         *  LocalDate date = new LocalDate(); --> compile error
         */

        //java.time.DateTimeException:
        //LocalDate invalidDate = LocalDate.of(2020, 2, 30);

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);


        DateTimeFormatter f = DateTimeFormatter.ofPattern("'Date:' YYYY-MMM-dd '  Time:' hh:mm");

        LocalDateTime localDateTime2 = LocalDateTime.of(2020, Calendar.JUNE, 8, 12,30);
        //System.out.println(  f.format(time1)  );
        System.out.println(  f.format(localDateTime2)  );


        System.out.println("--------------------");

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate localDate2 = LocalDate.parse("04-05-1971", f2);
        System.out.println(localDate2);
        System.out.println(LocalTime.parse("12:34"));

        StringBuilder bas =new StringBuilder( "rumble");
        bas.append(4).deleteCharAt(3).delete(3, bas.length() - 1); System.out.println(b);


        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.append("vaJ$").delete(0, 3);
        int ind = puzzle.length() - 1;
        puzzle.deleteCharAt(ind);

        System.out.println(puzzle);
    }



    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }
}
