package javaprojects;

public class ConstantTime {
	public static void printFirstElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element"+i+":"+arr[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50};
		printFirstElement(numbers);
	}
}
