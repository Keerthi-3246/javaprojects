package javaprojects;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int next=a+b;
			a=b;
			b=next;
		}
		scan.close();
	}

}
