
/**
 * CodingBat Java Activity "icyHot" from Warmup1.
 * codingbat.com
 */
public class IcyHot
{
	private static int failures = 0;
	private static final String METHOD_NAME = "icyHot";

	/**
	 * INSTRUCTIONS:
	 * Given two temperatures, return true if one is less than 0 and the other
	 * is greater than 100.
	 * 
	 * icyHot(120, -1) -> true
	 * icyHot(-1, 120) -> true
	 * icyHot(2, 120) -> false
	 * 
	 */
	public static boolean icyHot(int temp1, int temp2)
	{
		return((temp1 > 100 || temp2 > 100) && (temp1 < 0 || temp2 < 0 ));
	}

	public static void main(String[] args)
	{
		testCase(120, -1, true);
		testCase(-1, 120, true);
		testCase(2, 120, false);
		testCase(-1, 100, false);
		testCase(-2, -2, false);
		testCase(120, 120, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, boolean result)
	{
		String r;
		try
		{
			r = ""+icyHot(a, b);
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