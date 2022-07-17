public class SumDouble
{
	private static int failures = 0;
	private static final String METHOD_NAME = "sumDouble";
	/**
	 * INSTRUCTIONS:
	 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	 * 
	 * sumDouble(1, 2) -> 3
	 * sumDouble(3, 2) -> 5
	 * sumDouble(2, 2) -> 8
	 * 
	 */
	public static int sumDouble(int a, int b)
	{
        if(a == b){
            return((a + b) * 2);
        }
        return(a + b);
		// ADD YOUR CODE HERE
	}

	public static void main(String[] args)
	{
		testCase(1, 2, 3);
		testCase(3, 2, 5);
		testCase(2, 2, 8);
		testCase(-1, 0, -1);
		testCase(3, 3, 12);
		testCase(0, 0, 0);
		testCase(0, 1, 1);
		testCase(3, 4, 7);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int b, int result)
	{
		String r;
		try
		{
			r = ""+sumDouble(a, b);
			if (r.equals(""+result))
			{
				System.out.print("PASS: ");
			}
			else
			{
				System.out.println("FAIL: ");
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