package javaprojects;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> countryName=new TreeMap<String,String>();
		countryName.put("India", "New Delhi");
		countryName.put("USA", "Washington");
		countryName.put("Germany", "Berlin");
		countryName.put("Japan", "Tokyo");
		countryName.put("India", "Delhi");
		System.out.println(countryName);
		System.out.println(countryName.firstKey());
		System.out.println(countryName.lastKey());
		System.out.println(countryName.higherKey("Japan"));
		System.out.println(countryName.lowerKey("USA"));
	}
}
