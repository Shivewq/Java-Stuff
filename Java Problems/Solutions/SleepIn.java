
/**
 * CodingBat Java Activity "sleepIn" from Warmup1.
 * codingbat.com
 */

public class SleepIn
{
	private static int failures = 0;
	private static final String METHOD_NAME = "sleepIn";

	/**
	 * INSTRUCTIONS:
	 * The parameter weekday is true if it is a weekday, and the parameter 
	 * vacation is true if we are on vacation. We sleep in if it is not a 
	 * weekday or we're on vacation. Return true if we sleep in.
	 * 
	 * sleepIn(false, false) -> true
	 * sleepIn(true, false) -> false
	 * sleepIn(false, true) -> true
	 * 
	 */
	public static boolean sleepIn(boolean weekday, boolean vacation)
	{
		// ADD YOUR CODE HERE
        if (weekday == false || vacation == true){
           return true; 
        } 
        return false;
	}

	public static void main(String[] args)
	{
		testCase(false, false, true);
		testCase(true, false, false);
		testCase(false, true, true);
		testCase(true, true, true);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(boolean a, boolean b, boolean result)
	{
		String r;
		try
		{
			r = ""+sleepIn(a, b);
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
		System.out.println(METHOD_NAME+"("+a+", "+b+") -> "+r + ", EXPECTED: "+result);
	}

}