package com.ga.datastructures;

import java.util.Arrays;

public class ArrayRotation {

    // rotates the array to the left by d positions
    public static void rotate(int[] arr, int d, int n) {

        // checks if the array is empty
        if (n == 0) {
            return;
        }

        // handles cases where d is bigger than the array size
        // ensures that rotating by a number bigger than the array size still works
        d = d % n;

        // controls how many times we rotate the array
        for (int i = 0; i < d; i++) {
            // saves the first number in the index before moving the others
            int first = arr[0];

            // moves each number one position to the left
            for (int j = 0; j < n - 1; j++) {
                // take the number on the right and copy it into the current position
                arr[j] = arr[j + 1];
            }

            // moves the first number to the end
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {

        // create an array with 5 elements
        int[] arr = {1, 2, 3, 4, 5};

        // number of positions to rotate
        // we want to rotate the array by two positions
        int d = 2;

        // gets the size of the array
        int n = arr.length;

        // prints the array before rotation
        System.out.println("Original array: " + Arrays.toString(arr));

        // calls the rotate method
        rotate(arr, d, n);

        // prints the array after rotation
        System.out.println("After: " + Arrays.toString(arr));
    }
}
