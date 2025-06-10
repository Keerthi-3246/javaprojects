package abc;

public class SpanOfArray {
	public static  int spanofarray(int a[]) {
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}if(a[i]<min) {
			min=a[i];
		}
	}
	return max-min;
}
	public static void main(String[] args) {
		int[]a= {30,50,70,40,10};
		System.out.println(spanofarray(a));
		
	}
}
