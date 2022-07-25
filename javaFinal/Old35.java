/**
 * CodingBat Java Activity "old35" from Logic1.
 * codingbat.com
 */
public class Old35
{
	private static int failures = 0;
	private static final String METHOD_NAME = "old35";

	/**
	 * INSTRUCTIONS:
	 * Return true if the given non-negative number is a multiple of 3 or 5,
	 * but not both. 
	 * 
	 * old35(3) -> true
	 * old35(10) -> true
	 * old35(15) -> false
	 * 
	 */
	public static boolean old35(int n)
	{
		// ADD YOUR CODE HERE
		if((n % 5 == 0) && (n % 3 == 0)){
			return false;
		}
		else return((n % 5 == 0) || (n % 3 == 0));
		
		
	}

	public static void main(String[] args)
	{
		testCase(3, true);
		testCase(10, true);
		testCase(15, false);
		testCase(5, true);
		testCase(9, true);
		testCase(8, false);
		testCase(7, false);
		testCase(6, true);
		testCase(17, false);
		testCase(18, true);
		testCase(29, false);
		testCase(20, true);
		testCase(21, true);
		testCase(22, false);
		testCase(45, false);
		testCase(99, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+old35(a);
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.print("FAIL: ");
				failures ++;
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures ++;
		}
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+result);
	}

}
