package javaprojects;

import java.util.Scanner;

public class polydrme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				System.out.println("false");
				break;
			}
			else {
				left++;
				right--;
				System.out.println("True");
				break;
			}
		}
		sc.close();
	}

}
