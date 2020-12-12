package com.demo.Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task_12_remove_element_from_list {

    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>(Arrays.asList("John", "Joe", "Mike", "John", "Jane", "John"));

        System.out.println("ls = " + removeElement2(ls, "John"));
    }

    private static ArrayList<String> removeElement(ArrayList<String> list, String target){
        while(list.contains(target)){
            list.remove(target);
        }
        return list;
    }

    private static ArrayList<String> removeElement2(ArrayList<String> list, String target){
        Iterator it = list.iterator();
        while (it.hasNext()){
            if(it.next().equals(target)) it.remove();
        }
        return list;
    }

    private static ArrayList<String> removeElement3(ArrayList<String> list, String target){
        list.removeIf(o -> o.equals(target));
        return list;
    }

}
