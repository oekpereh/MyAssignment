/**
 * @Class: hasPalindrome
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This program will write a method countPalindromes that takes a string as input and returns
 * if the string is a palindrome or not.
 * In this program I will declare variable: S and N.
 */


public class hasPalindrome {
    public boolean hasPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "level";
        String str2 = "A man, a plan, a canal: Panama!";
        String str3 = "Radar";

        System.out.println(countPalindromes(str1));
        System.out.println(countPalindromes(str2));
        System.out.println(countPalindromes(str3));
    }
}