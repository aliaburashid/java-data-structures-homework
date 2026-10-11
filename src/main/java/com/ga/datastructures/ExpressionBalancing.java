package com.ga.datastructures;


public class ExpressionBalancing {

    // checks if all brackets are balanced
    public static boolean isBalanced(String exp) {

        // creates a stack with enough space for the expression
        SingleArrayStack stack = new SingleArrayStack(exp.length());

        // goes through each character in the expression
        for (int i = 0; i < exp.length(); i++) {

            // gets the current character
            char ch = exp.charAt(i);

            // adds opening brackets to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // checks if the character is a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // if there is no opening bracket, it is not balanced
                if (stack.isEmpty()) {
                    return false;
                }

                // removes the most recent opening bracket
                char open = stack.pop();

                // checks if the opening and closing brackets match
                if (ch == ')' && open != '(') {
                    return false;
                }

                if (ch == '}' && open != '{') {
                    return false;
                }

                if (ch == ']' && open != '[') {
                    return false;
                }
            }
        }

        // returns true only if no opening brackets are left
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        // expressions to test
        String exp1 = "{[()]}";
        String exp2 = "{[}]";
        String exp3 = "(a+b)";
        String exp4 = "((a+b)";

        // prints whether each expression is balanced
        System.out.println(exp1 + ": " + isBalanced(exp1));
        System.out.println(exp2 + ": " + isBalanced(exp2));
        System.out.println(exp3 + ": " + isBalanced(exp3));
        System.out.println(exp4 + ": " + isBalanced(exp4));
    }
}
