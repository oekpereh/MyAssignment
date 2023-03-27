/**
 * @Class: sumDigits
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This java class contains the completed methods and test
 * by calling the methods with appropriate inputs in the main method.
 * In this program, I will declare variable: Sum.
 */

public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(4567));
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

