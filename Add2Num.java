import java.util.Scanner;

public class Add2Num {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Enter the 1st number: ");
		int i = scan.nextInt();
		System.out.print("Enter the 2nd number: ");
		int j = scan.nextInt();
		
		System.out.println("The sum of " + i + " and " + j + " is: " + (i+j));
	}

}
