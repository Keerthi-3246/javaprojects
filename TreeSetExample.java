package javaprojects;

//import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> EmployeeNames=new TreeSet<String>();
		EmployeeNames.add("sumit");
		EmployeeNames.add("Karan");
		EmployeeNames.add("Anjali");
		EmployeeNames.add("Keerthi");
		EmployeeNames.add("Zoya");
		System.out.println(EmployeeNames);
		System.out.println(EmployeeNames.descendingSet());
		
		
	}

}
