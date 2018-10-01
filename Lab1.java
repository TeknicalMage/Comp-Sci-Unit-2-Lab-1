# Comp-Sci-Unit-2-Lab-1
import java.util.Scanner;
/*Julian Jordan
 * Unit 2 Lab 1
 *  9/9/18
 */

public class lab1 {
	public static void main(String[] args) {
		//Gets Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Type your first number");
		//Original Values for numbers to input 
		int a = 0;
		int b = 0;
		a = input.nextInt();
		System.out.println("Type your second number");
		b = input.nextInt();
		if (a < b) {
			int quoitent = a/b;
			int remainder = a%b;
			//Outputs to the console
			System.out.print(a + " Divided by " + b + " is ");
			System.out.print(quoitent + " with a remainder of " + remainder );
		}else {
			int quoitent = b/a;
			int remainder = b%a;
			//Outputs to the console
			System.out.print(b + " Divided by " + a + " is ");
			System.out.print(quoitent + " with a remainder of " + remainder );
		}
			
	}

}
