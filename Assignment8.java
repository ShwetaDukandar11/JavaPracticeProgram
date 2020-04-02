package StringProgram;

import java.util.Scanner;

public class Assignment8
{
	/**

	Given 3 int arguments - a, b, c, return their sum. However, if one of the arguments 
	is the same as any of the other ones, that number should not count towards the sum. 
	So basically you only sum unique numbers, not duplicates
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		sumUnique(1, 2, 3)   <b>---></b> 6 <br>
		sumUnique(3, 2, 3)    <b>---></b> 2 <br>
		sumUnique(3, 3, 3) <b>---></b> 0 <br>
	 */

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first number");
		int a=scan.nextInt();
		System.out.println("Enter a second number");
		int b=scan.nextInt();
		System.out.println("Enter a third number");
		int c=scan.nextInt();
		System.out.println(sumUnique(a, b, c));
		scan.close();
	}
	public static int sumUnique(int a,int b,int c)
	{
		int sum=0;
		if(a==b && b==c && c==a)
		{
			return 0;
		}
		else if(a==b)
		{
			return c;
		}
		else if(a==c)
		{
			return b;
		}
		else if(b==c)
		{
			return a;
		}
		else
		{
			return sum=a+b+c;
		}
	}
}
