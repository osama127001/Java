package com.contour;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Difference between == and .equals()
        String s1 = new String("osama");
        String s2 = new String("osama");
        System.out.println(s2 == s1); // false, == checks memory address, reference
        System.out.println(s1.equals(s2)); // true, check values

        // Arrays
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));

        // Multi-dimensional arrays
        int [][] arr = new int [2][2];
        arr[0][0] = 4;
        System.out.println(Arrays.deepToString(arr));
    }
}
