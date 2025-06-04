package javaprojects;

import java.util.Scanner;

public class Polidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        String reversed = new StringBuilder(input).reverse().toString();

		        if (input.equalsIgnoreCase(reversed)) {
		            System.out.println("The string is polindrome.");
		        } else {
		            System.out.println("The string is not a palindrome.");
		        }
		        scanner.close();
		    }
	}
