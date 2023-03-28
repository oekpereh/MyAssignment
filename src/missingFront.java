/**
 * @Class: missingFront
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This java class contains the completed methods and test
 * by calling the methods with appropriate inputs in the main method.
 */

public class missingFront {
    public static void main(String[] args) {
        System.out.println(missingFront("abcd"));
        System.out.println(missingFront("Holiday"));
        System.out.println(missingFront("House"));
    }

    public static String missingFront(String str) {
        return str.substring(3);
    }
}

