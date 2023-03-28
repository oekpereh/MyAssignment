/**
 * @Class: everyOther
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This java program will return a new string made of every other character starting with the first character.
 */

public class everyOther {
    public static String everyOther(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(everyOther("hello"));
        System.out.println(everyOther("codingbat"));
        System.out.println(everyOther("abcdefg"));
        System.out.println(everyOther("x"));
        System.out.println(everyOther("123456789"));
    }
}