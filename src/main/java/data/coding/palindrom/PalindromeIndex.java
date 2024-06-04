package data.coding.palindrom;

public class PalindromeIndex {
    
    public static void main(String[] args) {
        String s = "aaab";
        int index = Palindrom.palindromeIndex(s); // O(n) solution
        System.out.println(index); // Output: 3
    }
}


class Palindrom {

    public static int palindromeIndex(String s) {
        
        int i = 0;
        int j = s.length() - 1;

        while(i<j) {

            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // remove i char to see if it becomes Palindrome or not
                if(isPalindrome(s, i+1, j)) {
                    return i;
                }
                // remove j char to see if it becomes Palindrome or not
                if(isPalindrome(s, i, j-1)) {
                    return j;
                }
                // If neither removal helps
                return -1;
            }
        }

        return -1;
    }

    private static boolean isPalindrome(String s, int start, int end) {

        while(start<end) {
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

}