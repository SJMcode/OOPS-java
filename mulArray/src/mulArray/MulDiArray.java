package mulArray;

import java.util.Scanner;

public class MulDiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr;
		int limit;
		arr = new int[10][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("array limit");
		limit = sc.nextInt();
		System.out.println("Enter array values");
		for(int i=0; i<limit; i++) {
			for(int j=0; j<limit; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<limit; i++) {
			for(int j=0; j<limit; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
sc.close();
	}

}
