package javaprojects;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> ToyBox=new Stack<String>();
		ToyBox.push("Ball");
		ToyBox.push("Blocks");
		ToyBox.push("Puzzle");
		System.out.println(ToyBox.pop());
		System.out.println(ToyBox);
		Queue<String> Icecream=new LinkedList<String>();
		Icecream.add("maya");
		Icecream.add("Leo");
		Icecream.add("Nina");
		System.out.println("serving  "+Icecream.poll());
		System.out.println(Icecream);
		

		



		
	}

}
