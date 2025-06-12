package javaprojects;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringsAlphabetical {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in) ;
			System.out.println("Enter number of strings"); 
			int n=scan.nextInt();
			scan.nextLine();
			String[] strings=new String[n];
			System.out.println("enter the strings");
			for(int i=0;i<n;i++) {
				strings[i]=scan.nextLine();
			}
			Arrays.sort(strings);
			System.out.println("sorrted List");
			for(String str:strings) {
				System.out.println(str);
			}
			
	
			scan.close();

	}

}
