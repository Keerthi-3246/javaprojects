package javaprojects;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the count of numbers:");
        int n = scan.nextInt(); // Number of elements

        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        int max = numbers[0]; 
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The biggest number is: " + max);
        scan.close();
    }
}
