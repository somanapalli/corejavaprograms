import java.util.Scanner;

public class ScannerDemo {

	
	public static void main(String[] args) {
		//ctrl+shift+o- to import the packages
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int x = s.nextInt();
	
		System.out.println("enter the second number");
		int y = s.nextInt();
		
		int z= x+y;
		System.out.println("sum is: " + z);
		
	}
}
