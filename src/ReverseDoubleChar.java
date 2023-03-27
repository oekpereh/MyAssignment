/**
 * @Class: ReverseDoubleChar
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This java class contains the completed methods and test
 * by calling the methods with appropriate inputs in the main method.
 * In this program, I will declare variable: String1, String2, String3.
 */

public class ReverseDoubleChar {
    public static String reverseDoubleChar(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i)).append(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "The";
        String s2 = "AABB";
        String s3 = "String";

        System.out.println(reverseDoubleChar(s1));
        System.out.println(reverseDoubleChar(s2));
        System.out.println(reverseDoubleChar(s3));
    }
}
