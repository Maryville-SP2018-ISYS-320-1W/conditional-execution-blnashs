import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected result:
 
 1.  true 4
 2.  true  4=4  wrong
 3.  false 4 doesn't = -3
 4.  false -1 isn't greater than 0  wrong
 
 5.  false 9 is not less than or equal to 0
 6.  true -3/-3 == 1
 7.  true -4 > -6
  
 */
public class P3_ConditionalExpressions {

	public static void main(String[] args) {
		int x = 4;
		int y = -3;
		int z = 4;
		
		// Replace "YOUR EXPRESSION HERE" with the expression you're validating
		System.out.println(x * (y + 2) > y - (y + z) * 2);
	}

}
