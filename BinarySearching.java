package abc;

import java.util.Arrays;

public class BinarySearching {
	public static int binarysearch(int[] a,int key) {
		int low=0;
		int high=a.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==a[mid]) {
				return mid;
			}
			else if (key<a[mid]) {
				high=mid-1;
				//low=low;
			}
			else {
				low=mid+1;
				//high=high;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,32,34,15,16,18,39,14};
		Arrays.sort(a);
		int key=16;
		System.out.println(binarysearch(a,key));
	}

}
