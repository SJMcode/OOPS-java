package prime;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a value");
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		int flag=0;
		for(int i=2; i<number/2; i++) {
			if(number %i == 0) {
				flag =1;
			}
		}
		if(flag ==0) {
			System.out.println("Number is prime");
		}
		if(flag ==1) {
			System.out.println("Number is not prime");
		}
		sc.close();

	}

}
