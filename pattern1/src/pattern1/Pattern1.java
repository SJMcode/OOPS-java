package pattern1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i ,j,n;
			System.out.println("Enter limit");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
		
	}

}
