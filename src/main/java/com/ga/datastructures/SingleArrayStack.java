package com.ga.datastructures;

public class SingleArrayStack {

    // maximum number of elements the stack can hold
    private final int maxSize;

    // array that stores the brackets
    private final char[] stackArray;

    // keeps track of the top element
    private int top;

    // constructor to create an empty stack
    public SingleArrayStack(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    // adds a character to the top of the stack
    public char push(char data) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = data;
            return data;
        }
        return 0;
    }

    // removes and returns the top character
    public char pop() {
        if (top >= 0) {
            return stackArray[top--];
        }
        return 0;
    }

    // checks if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // checks if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // returns the top character without removing it
    public char top() {
        return stackArray[top];
    }

    // prints all the elements in the stack
    public void printStack() {
        if (top >= 0) {
            System.out.println("Elements in stack : ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }
}
