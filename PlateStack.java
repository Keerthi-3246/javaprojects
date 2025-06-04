package javaprojects;

import java.util.Stack;

public class PlateStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> PlateStack=new Stack<String>();
		PlateStack.push("plate 1");
		PlateStack.push("plate 2");
		PlateStack.push("plate 3");
		PlateStack.push("plate 4");
		PlateStack.push("plate 5");
		System.out.println(PlateStack.peek());
		System.out.println("When someone eates" +PlateStack.pop());
		if(PlateStack.isEmpty()) {
			System.out.println("All plates are stacked");
		}
		

		
	}

}
