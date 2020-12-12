package com.demo.Interview_Questions;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class Palindrome {

    public static void main(String[] args) {
        String str = "Rejep Ejer".toLowerCase().replace(" ", "");

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome("Beza"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome(12321 + ""));

        System.out.println("The Number is palindrome: "+isPalindrome2(-12321));

    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    private static boolean isPalindrome(int num) {
        // 1234 /10 => 1232
        List<Integer> ls = new ArrayList<>();

        while (num != 0) {
            ls.add(num % 10);
            num /= 10;
        }

        for (int i = 0; i < ls.size() / 2; i++) {
            if (ls.get(i)!=ls.get(ls.size()-1-i))
                return false;
        }
        return true;
    }

    private static boolean isPalindrome2(int num){
        int final_num = 0;
        int temp = num;
        while (num != 0){
            final_num = final_num * 10 + num % 10;
            num /= 10;
        }
        return final_num == temp;
    }
}


//CoderByte interview assignment
class Problem{

    public static void main(String[] args) {

        System.out.println(remove_1_or_2_chars_To_make_Palindrome("abccbn"));

        Assert.assertEquals(remove_1_or_2_chars_To_make_Palindrome("kayak"),"String is palindrome already");
        Assert.assertEquals(remove_1_or_2_chars_To_make_Palindrome("abcbam"),"m");
        Assert.assertEquals(remove_1_or_2_chars_To_make_Palindrome("kaaamaaa"),"k");
        Assert.assertEquals(remove_1_or_2_chars_To_make_Palindrome("racecar"),"String is palindrome already");
        Assert.assertEquals(remove_1_or_2_chars_To_make_Palindrome("01234563210"),"45");

    }

    private static String remove_1_or_2_chars_To_make_Palindrome(String str){

        int low=0, high=str.length()-1;

        String res = "";

        while(low<high){

            if(str.charAt(low)==str.charAt(high)){
                low++;
                high--;
            }else {

                if(isPalindrome(str, low+1, high)) res = str.charAt(low)+"";
                else if(isPalindrome(str, low, high-1)) res = str.charAt(high)+"";
                else if(isPalindrome(str, low+2, high )) res = str.substring(low, low+2);
                else if(isPalindrome(str, low, high-2 )) res = str.substring(high-1, high+1);

                if(str.length()-res.length()>=3 && res.length()>0) {
                    System.out.println("To make palindrome remove: "+ res);
                    return res;
                }
                return "not possible by removing 1 or 2 characters";
            }
        }
        return "String is palindrome already";
    }
    /**
     * The method allows us to check if substring is palindrome or not bounded with low and high indexes.
     * @param str
     * @param low
     * @param high
     * @return
     */
    private static boolean isPalindrome(String str, int low, int high){

        while(low<high){
            if(str.charAt(low)!=str.charAt(high)) return false;
            low++;
            high--;
        }

        return true;
    }

}