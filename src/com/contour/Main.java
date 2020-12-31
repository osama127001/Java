package com.contour;

import java.util.Arrays;
import java.util.Scanner;

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

        // Implicit Casting, Automatic casting, no data loss
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        // Explicit casting, data loss
        float f = 56.4f;
        int g = (int)f + 4;
        System.out.println(g);

        // Explicit casting for strings
        String num = "123";
        int numToInt = Integer.parseInt(num);
        System.out.println(numToInt);
        String numToString = String.valueOf(numToInt);
        System.out.println(numToString);

        // Reading input using scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt(); // this line reads the input based on the data type.
        System.out.println("Number is: " + number);

        // For reading strings
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.println(name);

        // For reading complete lines
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine().trim(); //.trim() removes blank spaces before and after strings
        System.out.println(fullName);

        // Testing Linked list



    }
}
