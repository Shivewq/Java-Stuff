/*
 * CodingBat Java Activity "bunnyEars" from Recursion-1 section.
 * codingbat.com
 */

public class BunnyEars 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "bunnyEars";
	
	/*
	 * INSTRUCTIONS
	 * We have a number of bunnies and each bunny has two big floppy ears. 
	 * We want to compute the total number of ears across all the bunnies 
	 * recursively (without loops or multiplication).
	 * 
	 * bunnyEars(0) -> 0
	 * bunnyEars(1) -> 2
	 * bunnyEars(2) -> 4
	 */
	public static int bunnyEars(int bunnies)
	{
        if (bunnies <= 0) {
            return 0; 
        } else {
            return (2 + bunnyEars(bunnies - 1)); // 2 + each bunny, subtracted 1 each iteration
        }
	}
	
	public static void main(String[] args)
	{
		testCase(0, 0);
		testCase(1, 2);
		testCase(2, 4);
		testCase(3, 6);
		testCase(4, 8);
		testCase(5, 10);
		testCase(12, 24);
		testCase(50, 100);
		testCase(234, 468);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int expected)
	{
		String r;
		try
		{
			r = ""+ bunnyEars(a);
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