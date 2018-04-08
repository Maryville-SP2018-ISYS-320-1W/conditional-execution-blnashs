import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		
		public static double pay(double salary, int hours) {
			if(Math.min(hours,  40)==hours)
				return salary*hours;
			else
				return salary*8+salary*1.5*(hours-8);
		}
		public static void main(String) {}args){
			
		}
		
		

	}

}
