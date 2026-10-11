package com.ga.datastructures;

import java.util.Stack;

public class StackReversal {

    // inserts a number at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int number) {

        // if the stack is empty, add the number
        if (stack.isEmpty()) {
            stack.push(number);
            return;
        }

        // removes the top number and saves it
        int top = stack.pop();

        // calls the method again to reach the bottom
        insertAtBottom(stack, number);

        // puts the saved number back on top
        stack.push(top);
    }

    // reverses the stack using recursion
    // removes all the numbers, one at a time, using pop()
    public static void reverse(Stack<Integer> stack) {

        // stops when the stack is empty
        if (stack.isEmpty()) {
            return;
        }

        // removes and saves the top number
        int top = stack.pop();

        // reverses the remaining elements
        reverse(stack);

        // puts the saved number at the bottom
        insertAtBottom(stack, top);
    }

    public static void main(String[] args) {

        // creates an empty stack
        Stack<Integer> stack = new Stack<>();

        // adds numbers to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // prints the stack before reversing
        System.out.println("Before: " + stack);

        // calls the reverse method
        reverse(stack);

        // prints the stack after reversing
        System.out.println("After: " + stack);
    }
}