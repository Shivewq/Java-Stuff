/*
 * CodingBat Java Activity "count8" from Recursion-1 section.
 * codingbat.com
 */

public class SumDigits 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "sumDigits";
	
	/*
	 * INSTRUCTIONS
     * 
     * Given a non-negative int n, return the sum of its digits RECURSIVELY (no loops). 
	 * 
     * sumDigits(126) → 9
     * sumDigits(49) → 13
     * sumDigits(12) → 3
	 */
	public static int sumDigits(int n)
	{
		if(n < 10) return n;  //return n as sums of 1-digits are itself
		else return n % 10 + sumDigits(n / 10);
	}
	
	public static void main(String[] args)
	{
		testCase(126, 9);
		testCase(49, 13);
		testCase(12, 3);
		testCase(10, 1);
		testCase(1, 1);
		testCase(0, 0);
		testCase(730, 10);
		testCase(1111, 4);
        testCase(11111, 5);
        testCase(10110, 3);
        testCase(235, 10);
        testCase(9900000, 18);
	

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int expected)
	{
		String r;
		try
		{
			r = ""+ sumDigits(a);
			if (r.equals(""+ expected))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
				failures++;
			}
		}
		catch (Exception e)
		{
			r = e.getMessage();
			System.out.print("FAIL: ");
			failures++;
		}
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+ expected);
	}

}
