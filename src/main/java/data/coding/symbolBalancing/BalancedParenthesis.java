package data.coding.symbolBalancing;

import java.util.Stack;

public class BalancedParenthesis {


    public static void main(String[] args) {
        System.out.println("checkBalanced(\"(A+B)-{C+D}\") = " + checkBalanced("(A+B)-{C+D}"));
        System.out.println("checkBalanced(\"{{{(({}[]))[]}}}\") = " + checkBalanced("{{{(({}[]))[]}}}"));
        System.out.println("checkBalanced(\"()(()[()])\") = " + checkBalanced("()(()[()])"));
        System.out.println("checkBalanced(\"()(()[()(])\") = " + checkBalanced("()(()[()(])"));
    }

    static boolean checkBalanced(String expression) {

        var stack = new Stack<Character>();

        for (var i=0; i<expression.length(); i++) {
            var ch = expression.charAt(i);

            if(checkOpen(ch)) {
                stack.push(ch);
            } else if(checkClosing(ch)) {
                if(
                        ch == ')' && stack.peek() != '(' ||
                        ch == '}' && stack.peek() != '{' ||
                        ch == ']' && stack.peek() != '['
                ) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    static boolean checkOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    static boolean checkClosing(char c) {
        return c == ')' || c == '}' || c == ']';
    }
}
