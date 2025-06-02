package javaprojects;
import java.util.ArrayList; // Import the correct ArrayList
import java.util.Collections;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  students=new ArrayList<String>();
		students.add("keerthi");
		students.add("Deepthi");
		students.add("Spurthi");
		students.add("Jayanthi");
		System.out.println(students);
		Collections.sort(students);
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
		}
		students.remove(2);
		System.out.println(students);
		System.out.println(students.indexOf("keerthi"));
		Collections.reverse(students);
		System.out.println(students);
	}

}
