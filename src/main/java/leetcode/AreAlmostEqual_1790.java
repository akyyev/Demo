package leetcode;

public class AreAlmostEqual_1790 {
    
    public static void main(String[] args) {
        AreAlmostEqual_1790 obj = new AreAlmostEqual_1790();
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(obj.areAlmostEqual(s1, s2));
    }

    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int len = s1.length();
        int swapCount = 0;

        int[] swapIndices = new int[2];

        for(int i = 0; i<len; i++) {
            char f = s1.charAt(i);
            char s = s2.charAt(i);

            if(f != s) {
                if(swapCount == 2) return false;
                swapIndices[swapCount++] = i;
            }
        }

        if(swapCount == 0) return true;
        if(swapCount != 2) return false;
        
        return 
            s1.charAt(swapIndices[0]) == s2.charAt(swapIndices[1]) && 
            s1.charAt(swapIndices[1]) == s2.charAt(swapIndices[0]);    
    }
}
