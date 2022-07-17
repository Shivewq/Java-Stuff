/*
 * CodingBat Java Activity "fibonacci" from Recursion-1 section.
 * codingbat.com
 */

public class Fibonacci 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "fibonacci";
	
	/*
	 * INSTRUCTIONS
	 * The fibonacci sequence is a famous bit of mathematics, and it happens to 
	 * have a recursive definition. The first two values in the sequence are 0 and 1 
	 * (essentially 2 base cases). Each subsequent value is the sum of the previous 
	 * two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
	 * Define a recursive fibonacci(n) method that returns the nth fibonacci number, 
	 * with n=0 representing the start of the sequence.
	 * 
	 * fibonacci(0) -> 0
	 * fibonacci(1) -> 1
	 * fibonacci(2) -> 1
	 */
	public static int fibonacci(int n)
	{
		if(n == 0) return 0;
        else if(n == 1) return 1;
        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
	}
	
	public static void main(String[] args)
	{
		testCase(0, 0);
		testCase(1, 1);
		testCase(2, 1);
		testCase(3, 2);
		testCase(4, 3);
		testCase(5, 5);
		testCase(6, 8);
		testCase(7, 13);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int expected)
	{
		String r;
		try
		{
			r = ""+ fibonacci(a);
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