/**
 * @Class: nonStart
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This java program will return their concatenation, except omit the first character of each string.
 * The strings will be at least length 1.
 */


public class nonStart {
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("coding", "bat"));
        System.out.println(nonStart("a", "b"));
    }
}
