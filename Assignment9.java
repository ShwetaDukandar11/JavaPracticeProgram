package StringProgram;

public class Assignment9 
{
	/**

	Given 2 positive int arguments (a, b), return whichever argument is 
	nearest to the number 21 without going over.
	Return 0 if they both go over 21. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		nearestTwentyOne(19, 21)   <b>---></b> 21 <br>
		nearestTwentyOne(21, 19)    <b>---></b> 21 <br>
		nearestTwentyOne(19, 22) <b>---></b> 19 <br>
		nearestTwentyOne(32, 22) <b>---></b> 0 <br>
	 */

	public static void main(String[] args) 
	{
		System.out.println(nearestTwentyOne(19,21));
		System.out.println(nearestTwentyOne(21,21));
		System.out.println(nearestTwentyOne(21,19));
		System.out.println(nearestTwentyOne(32,22));
		System.out.println(nearestTwentyOne(9,1));

	}
	public static int nearestTwentyOne(int a,int b)
	{
		
		if(a<=21 || b<=21)
		{
			if(a>=b)
			{
				return a;
			}
			else
			{
				return b;
			}
		}
		else
		{
			return 0;
		}
	}

}
