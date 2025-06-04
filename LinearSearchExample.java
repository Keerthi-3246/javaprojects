package javaprojects;

public class LinearSearchExample {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 6, 4};
        int target = 0;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) { 
                System.out.println("Found " +" "+ target + " at index " + i);
                found= true;
                break; 
            }
        }
        if(!found) {
        	System.out.println("number" +" "+target+"not found");
        }

    }
}
