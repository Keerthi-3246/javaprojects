package javaprojects;

import java.util.Arrays;

public class StringsAlphabeticalOrder {

	public static void main(String[] args) {
		String[] strings= {"banana","guava","apple","kiwi"};
		Arrays.sort(strings);
	
	for(String str:strings) {
		System.out.println(str);
	}

}
}
