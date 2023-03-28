/**
 * @Class: birthdayName
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 27, 2023
 * This java program will return a message of the form "Happy Birthday Susan!", given a string name.
 */


public class birthdayName {
    public static void main(String[] args) {
        System.out.println(birthdayName("Juan"));
        System.out.println(birthdayName("Cindy"));
        System.out.println(birthdayName("John"));
    }

    public static String birthdayName(String name) {
        return "Happy Birthday " + name + "!";
    }
}
