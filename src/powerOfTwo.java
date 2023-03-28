/**
 * @Class: powerOfTwo
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This program will return true if it is a power of 2.
 * In this program I will declare variable: N.
 */

public class powerOfTwo {
    public static boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        do {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        } while (n != 1);

        return true;
    }

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 2;
        int n4 = 3;

        System.out.println(powerOfTwo(n1));
        System.out.println(powerOfTwo(n2));
        System.out.println(powerOfTwo(n3));
        System.out.println(powerOfTwo(n4));
    }
}