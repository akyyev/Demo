package leetcode;

public class AddStrings_415 {
    public static void main(String[] args) {
        AddStrings_415 obj = new AddStrings_415();
        String num1 = "9123";
        String num2 = "1456";
        System.out.println(obj.addStrings(num1, num2));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        
        int carry = 0;
        
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        
        while(p1 >= 0 || p2 >= 0) {
            int sum = carry;
            if(p1 >= 0) sum += num1.charAt(p1--) - '0';
            if(p2 >= 0) sum += num2.charAt(p2--) - '0';
            
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        if(carry != 0) {
            sb.insert(0, carry);
        }
        return sb.toString();
    }


}