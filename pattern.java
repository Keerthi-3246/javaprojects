package abc;

public class pattern {

	public static void main(String[] args) {
		int i,j=1;
		int n=5;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i*j<10) {
					System.out.print("0");
				}
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
