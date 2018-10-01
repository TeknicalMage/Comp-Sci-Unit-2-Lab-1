import java.util.Scanner;
/*Julian Jordan
 * Unit 2 Lab 2
 *  9/9/18
 */
//Main Stream 
public class Lab2 {
	public double base;
	public double exponent;
	public Lab2() {
		Scanner input = new Scanner(System.in);
		int set;
		//Function where all the math is actually done
		calc();
		System.out.println("Type your next Base to continue or 0 to exit");
		set = input.nextInt();
		//0 to exit otherwise type your base to continue
		if (set == 0) {
			System.out.println("Cya");
			System.exit(0);
		}
		base = set;
		calc2();
	}
	//Function with all the calculations
public void calc(){
	//input for base
	Scanner input = new Scanner(System.in);
	System.out.println("Type your Base");
	base = input.nextDouble();
	//input for exponent
	System.out.println("Type your Exponent");
	exponent = input.nextDouble();
	//Base to the power of exponent
	double exponentresult = Math.pow(base, exponent);
	//output
	System.out.println(base + " to the power of " + exponent + " is " + exponentresult);
	//Start of loop
	calc3();
	}
//Continued by typing you base (not zero) loop
public void calc2() {
	//System.out.println(base); <- Just for testing
	calc1o2();

}
//More calculations loop	
public void calc1o2(){
	Scanner input = new Scanner(System.in);
	System.out.println("Type your Exponent");
	exponent = input.nextDouble();
	double exponentresult = Math.pow(base, exponent); 
	System.out.println(base + " to the power of " + exponent + " is " + exponentresult);
	//Seperation of the if exit statement.
	calc3();
	}
//If 0 leave else keep on goin
public void calc3() {
	Scanner input = new Scanner(System.in);
	int set;
	System.out.println("Type your next Base to continue or 0 to exit");
	set = input.nextInt();
	if (set == 0) {
		System.out.println("Cya");
		System.exit(0);
	}
	base = set;
	//The cycle continues, back up to calc2
	calc2();
}


	public static void main(String[] args) {
		new Lab2();

	}
}
