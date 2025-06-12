package javaprojects;

import java.util.LinkedList;
import java.util.Queue;

public class IcecreamTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> kids=new LinkedList<String>();
		kids.add("kid 1");
		kids.add("kid 2");
		kids.add("kid 3");
		kids.add("kid 4");
		kids.add("kid 5");
		System.out.println(kids);
		String firstOut=kids.poll();
		System.out.println(firstOut);
		System.out.println(kids);
		String firstIn=kids.remove();
		System.out.println(firstIn);
		System.out.println(kids);
		String first=kids.remove();
		System.out.println(first);
		System.out.println(kids);
		String f=kids.remove();
		System.out.println(f);
		System.out.println(kids);
		
		

		
		



	}

}
