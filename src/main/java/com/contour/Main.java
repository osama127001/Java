package com.contour;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



public class Main {

    public static void main(String[] args) {
	// write your code here


        // Instantiation and appending
        StringBuffer sbf = new StringBuffer("Osama");
        sbf.append(" Khan");
        System.out.println(sbf);

        // Replacing
        sbf.replace(0, 5, "Taha");
        System.out.println(sbf);

        // Deleting
        sbf.delete(5, 10);
        System.out.println(sbf);


    }

}


















