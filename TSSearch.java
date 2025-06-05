package javaprojects;

import java.util.Scanner;
import java.util.TreeSet;

public class TSSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> product=new TreeSet<String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a product Name");
		String s=scan.nextLine();
		product.add("keyboard");
		product.add("Mouse");
		product.add("Monitor");
		product.add("CPU");
		product.add("Webcam");
		if(product.contains(s)) {
			System.out.println("exits");
		}
		else {
			System.out.println("Not Exits");
		}
	scan.close();
	}

}
