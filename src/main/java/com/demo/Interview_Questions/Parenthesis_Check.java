package com.demo.Interview_Questions;

import java.util.EmptyStackException;
import java.util.Stack;

public class Parenthesis_Check {


    /**
     * Stack: LIFO, extends Vector(C) implements List (I)
     * Methods: push
     *          pop
     *          empty
     *          search
     *          peek
     *
     * Declare a character stack S.
     *      Now traverse the expression string exp.
     *      If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
     *      If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and
     *          if the popped character is the matching starting bracket then fine else parenthesis are not balanced.
     *      After complete traversal, if there is some starting bracket left in stack then “not balanced”
     *
     *
     * @param args
     */
    public static void main(String[] args) throws EmptyStackException {
        String str = "{{({})}}";
        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String str){
        Stack<Character> leftChars = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            boolean opening_parenthesis = c=='(' || c=='{' || c=='[';
            boolean closing_parenthesis = c==')' || c=='}' || c==']';

            if(opening_parenthesis) leftChars.push(c);
            else if(closing_parenthesis) {
                if(leftChars.isEmpty()) return false;
                if(     c == ')' && leftChars.peek()!='(' ||
                        c == '}' && leftChars.peek()!='{' ||
                        c == ']' && leftChars.peek()!='[') return false;
                leftChars.pop();
            }
        }
        return leftChars.isEmpty();
    }
}
