import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. FOOD MENU");
		System.out.println("1. POROTTA 2. BIRIYANI 3. MANDI 4. ALFAHM");
		Scanner sc = new Scanner (System.in);
		int c = sc.nextInt();
		switch(c) {
		
		case 1: System.out.println("POROTTA");
		break;
		case 2: System.out.println("BIRIYANI");
		break;
		case 3: System.out.println("MANDI");
		break;
		case 4: System.out.println("ALFAHM");
		break;
		default:
				System.out.println("CHAPPATHI");
		break;
		}
		sc.close();
		
	}

}
