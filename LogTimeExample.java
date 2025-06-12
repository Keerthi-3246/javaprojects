package javaprojects;

public class LogTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,3,6,8,9};
        int target = 8;
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low +high)/ 2;
            if (numbers[mid] == target) {
                System.out.println("Found " + target + " at index " + mid);
                return;
            } else if (target < numbers[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
            System.out.println("number not found");
        }
    }
