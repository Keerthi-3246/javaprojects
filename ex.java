package abc;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=1;
		int count=1;
		int n=5;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
