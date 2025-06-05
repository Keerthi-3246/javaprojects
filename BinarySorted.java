package javaprojects;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySorted {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String s = scan.nextLine();
        String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};
        int result = Arrays.binarySearch(names,s);
        if (result >= 0) {
            System.out.println(s + " exists in the list.");
        } else {
            System.out.println(s + " does not exist in the list.");
        }

        scan.close();
    }
}
