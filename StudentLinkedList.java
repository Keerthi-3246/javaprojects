package javaprojects;

import java.util.LinkedList;

public class StudentLinkedList {

	public static void main(String[] args) {
		LinkedList<String> students =new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Students");
		for(int i=1;i<=5;i++) {
			System.out.println("Enter name of students"+i+":");
					String name=sc.nextLine();
					students.add(name);
		}
					System.out.println("Students name are:");
					for(String student:students) {
						System.out.println(student);
					}sc.close();
		}

	}

