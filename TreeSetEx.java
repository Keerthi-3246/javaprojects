package javaprojects;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> BookId=new TreeSet<Integer>();
		BookId.add(5002);
		BookId.add(4998);
		BookId.add(5005);
		BookId.add(4999);
		BookId.add(5001);
		System.out.println(BookId);
		System.out.println(BookId.first());
		System.out.println(BookId.last());
		System.out.println(BookId.higher(4999));
		System.out.println(BookId.lower(5005));
	}
}
