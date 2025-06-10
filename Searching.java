package abc;

public class Searching {
	public static int LinearSearch(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a= {20,40,50,80,9};
		int key=60;
		System.out.println(LinearSearch(a,key));
	}

}
