package sumFunc;

import java.util.Scanner;

public class SumFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum();

	}
	
	static void sum() {
		int a ,b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		System.out.println("Result: "+sum);
	}

}
