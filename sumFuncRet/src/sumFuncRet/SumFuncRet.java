package sumFuncRet;

import java.util.Scanner;

public class SumFuncRet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b= sc.nextInt();
		c = sum(a , b);
		System.out.println("Result: "+c);
	}
	
	
	static int sum(int a , int b) {
		
		int result;
		result = a+b;
		return result;
	}

}
