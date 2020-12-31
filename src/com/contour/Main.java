package com.contour;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Difference between == and .equals()
        String s1 = new String("osama");
        String s2 = new String("osama");
        System.out.println(s2 == s1); // false, == checks memory address, reference
        System.out.println(s1.equals(s2)); // true, check values
    }
}
