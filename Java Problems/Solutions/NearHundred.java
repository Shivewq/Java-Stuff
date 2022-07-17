/**
 * CodingBat Java Activity "nearHundred" from Warmup1.
 * codingbat.com
 */
public class NearHundred
{
	private static int failures = 0;
	private static final String METHOD_NAME = "nearHundred";

	/**
	 * INSTRUCTIONS:
	 * Given an int n, return true if it is within 10 of 100 or 200. 
	 * Note: Math.abs(num) computes the absolute value of a number.
	 * 
	 * nearHundred(93) -> true
	 * nearHundred(90) -> true
	 * nearHundred(89) -> false
	 * 
	 */
	public static boolean nearHundred(int n)
	{
        if(n >= 90 && n <= 110 || n >= 190 && n <= 210) {
            return true;
        }
        return false;
	}

	public static void main(String[] args)
	{
		testCase(93, true);
		testCase(90, true);
		testCase(89, false);
		testCase(110, true);
		testCase(111, false);
		testCase(121, false);
		testCase(-101, false);
		testCase(-209, false);
		testCase(109, true);
		testCase(209, true);
		testCase(0, false);
		testCase(5, false);
		testCase(-50, false);
		testCase(191, true);
		testCase(189, false);
		testCase(200, true);
		testCase(210, true);
		testCase(211, false);
		testCase(290, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, boolean result)
	{
		String r;
		try
		{
			r = ""+nearHundred(a);
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
			System.out.println("FAIL: ");
			failures ++;
		}
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+result);
	}

}