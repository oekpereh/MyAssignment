/**
 * @Class: luckySum
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This java class contains the completed methods and test
 * by calling the methods with appropriate inputs in the main method.
 * In this program I will declare variable: Sum.
 */

public class luckySum {
    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum += a;
        } else {
            return sum;
        }
        if (b != 13) {
            sum += b;
        } else {
            return sum;
        }
        if (c != 13) {
            sum += c;
        } else {
            return sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
    }
}
