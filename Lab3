import java.util.Scanner;
//julian you should leave units in the query 
public class Lab3 {
			public Lab3() {
				main();
			}
			//Public Variables setup (Mostly for extra Cred Lab)
			int intial, growthrate, agrowthrate, obstime, total;
			public void main() {
				Scanner input = new Scanner(System.in);
				//Inputs and messages 
				System.out.println("Type the intial population");
				intial = input.nextInt();
				System.out.println("Type the growthrate");
				growthrate = input.nextInt();
				System.out.println("Type the time it takes to achieve your growthrate");
				agrowthrate = input.nextInt();
				System.out.println("Type your observation time");
				obstime = input.nextInt();
				
				for(int i=0; i<=obstime/agrowthrate;i++) {
					int res2 = (int) Math.pow(growthrate, i);
					int res3 = (int) intial * res2;
					System.out.println(res3 + " Organisms");
	}

			}
			

	public static void main(String[] args) {
		new Lab3();
	}
}
