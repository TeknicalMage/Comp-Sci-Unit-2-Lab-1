import java.util.Scanner;
//julian you should leave units in the query 
public class Lab_5 {
			public Lab_5() {
				main();
			}
			//Public Variables setup (Mostly for extra Cred Lab)
			int intial; 
			double growthrate, agrowthrate, obstime, total;
			public void main() {
				Scanner input = new Scanner(System.in);
				//Inputs and messages S
				System.out.println("Type the intial population");
				intial = input.nextInt();
				System.out.println("Type the growthrate");
				growthrate = input.nextDouble();
				System.out.println("Type the time it takes to achieve your growthrate");
				agrowthrate = input.nextDouble();
				System.out.println("Type your observation time");
				obstime = input.nextDouble();
				double res1 = (double) obstime/ agrowthrate;
				double res2 = (double) Math.pow(growthrate, res1);
				double res3 = intial * res2;
				
				int Final_Population = (int) res3;
				System.out.print(Final_Population + " Organisms");
	}
			

	public static void main(String[] args) {
		new Lab_5();
	}
}
