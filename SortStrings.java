package javaprojects;

public class SortStrings {

	public static void main(String[] args) {
		String[] strings= {"grapes","banana","apple","java"};
		for(int i=0;i<strings.length-1;i++) {
			for(int j=0;j<strings.length-1;j++) {
				 if (strings[j].compareTo(strings[j + 1]) > 0) {	
					String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
				}
			}
		}
		System.out.println("sorted bubble sort");
		for(String str:strings) {
			System.out.println(str);
		}
	}

}
