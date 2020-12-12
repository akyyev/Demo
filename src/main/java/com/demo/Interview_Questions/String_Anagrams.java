package com.demo.Interview_Questions;
import org.testng.Assert;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class String_Anagrams {

    public static void main(String[] args) {

        Assert.assertTrue(areAnagram("silent", "listen"));
        Assert.assertTrue(areAnagram("triangle", "integral"));
        Assert.assertTrue(areAnagram("aa", "aa"));
        Assert.assertTrue(areAnagram("ABC", "CAB"));
        Assert.assertFalse(areAnagram("Aa", "AA"));


        List<String> arrayList = new ArrayList<>();
        arrayList.add("TECH");
        arrayList.add("EXPERT");
        arrayList.set(0,"JAVA");
        arrayList.forEach(a->a.concat("FORUM"));
        arrayList.replaceAll(s -> s.concat("GROUP"));
        arrayList.removeIf(e->e.equals("JAVAGROUP"));
        arrayList.removeAll(Collections.singleton("JAVAGROUP"));
        System.out.println(arrayList);

    }

    private static boolean areAnagram(String str1, String str2) {

        if(str1.length()!=str2.length()) return false;

        char[] letters1 = str1.toCharArray();
        char[] letters2 = str2.toCharArray();

        java.util.Arrays.sort(letters1);
        java.util.Arrays.sort(letters2);

        return java.util.Arrays.equals(letters1, letters2);
    }
}
