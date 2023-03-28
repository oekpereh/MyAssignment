/**
 * @Class: swapEnds
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This java class contains the completed methods and test
 * by calling the methods with appropriate inputs in the main method.
 */

public class swapEnds {
    public static String swapEnds(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }

    public static void main(String[] args) {
        String[] testStrings = {"hello", "codingbat", "x", "ab", "12345"};
        for (String str : testStrings) {
            System.out.println(swapEnds(str));
        }
    }
}
