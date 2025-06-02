package javaprojects;
import java.util.HashSet;
import java.util.ArrayList;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> mobilephones=new HashSet<String>();
		mobilephones.add("samsung");
		mobilephones.add("Apple");
		mobilephones.add("oppo");
		mobilephones.add("iQ");
		mobilephones.add("Redmi");
		mobilephones.add("Realme");
		mobilephones.add("poko");
		mobilephones.add("vivo");
		mobilephones.add("samsung");
		mobilephones.add("samsung");
		System.out.println(mobilephones);
		ArrayList<String> mobilephonesList=new ArrayList<String>(mobilephones);
		System.out.println(mobilephonesList);
		
		
	}

}
