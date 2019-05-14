
import java.util.Scanner;
public class AverageMarks {


	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
        
        String name = scan.nextLine();
        char c = name.charAt(0);
        
        String num = scan.next();
        
        int num1 = Integer.parseInt(num);
        int num2 = Integer.parseInt(scan.next());
        int num3 = Integer.parseInt(scan.next());
        
        int avg = (num1+num2+num3)/3;
        
                
        System.out.println(c);
        System.out.print(avg);
		
	}

}
