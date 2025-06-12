package javaprojects;

public class QuadraticArray {

	public static void main(String[] args) {
		int[] numbers= {2,9,5,7,9};
		boolean hasDuplicate=false;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					hasDuplicate=true;
					System.out.println("Duplicate Found"+numbers[i]);
				}
			}
		}
		if(!hasDuplicate) {
			System.out.println("No Duplicates Found");
		}
	}

}
