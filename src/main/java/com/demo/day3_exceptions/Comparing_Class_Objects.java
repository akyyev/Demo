package com.demo.day3_exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * if sorting of objects needs to be based on natural order then use Comparable
 * whereas if you sorting needs to be done on attributes of different objects,
 * then use Comparator in Java.
 */

public class Comparing_Class_Objects {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("--------------------------------");
        System.out.println("Sorting movies by year(Natural Order). Using Comparable Interface... ");
        Collections.sort(list);//sorts movies by year
        list.forEach(movie -> System.out.println(movie.getName()+" "+ movie.getYear()));

        System.out.println("--------------------------------");
        System.out.println("Sorting movies by rating. Using Comparator Interface... ");
        Collections.sort(list, new RatingCompare());//sorts movies by rating
        //Collections.sort(list, (m1, m2)->m1.getRating()-m2.getRating()>0? 1: (m1.getRating()-m2.getRating())==0? 0 : -1);
        list.forEach(movie -> System.out.println(movie.getName()+" "+ movie.getRating()));

        System.out.println("--------------------------------");
        System.out.println("Sorting movies by name. Using Comparator Interface... ");
        Collections.sort(list, new NameCompare());//sorts movies by name
        list.forEach(movie -> System.out.println(movie.getName()));

    }


}


class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }

    /**
     * Used to sort movies by year...
     * @param o
     * @return
     */
    @Override
    public int compareTo(Movie o) {
        return this.year-o.year;
    }
}

class RatingCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        double dif = m1.getRating()-m2.getRating();
        return dif>0 ? 1 : dif == 0 ? 0 : -1;
    }
}

class NameCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());  //compareTo() is coming from String class
    }
}
