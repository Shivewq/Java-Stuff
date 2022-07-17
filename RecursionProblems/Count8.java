/*
 * CodingBat Java Activity "count8" from Recursion-1 section.
 * codingbat.com
 */

public class Count8 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "count8";
	
	/*
	 * INSTRUCTIONS
	 * Given a non-negative int n, compute recursively (no loops) the count of the 
	 * occurrences of 8 as a digit, except that an 8 with another 8 immediately to 
	 * its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the 
	 * rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost 
	 * digit (126 / 10 is 12).
	 * 
	 * count8(8) -> 1
	 * count8(818) -> 2
	 * count8(8818) -> 4
	 */
	public static int count8(int n)
	{
        System.out.println(n % 10);
        System.out.println(n / 10);
		if(n / 10 == 0) {           //continue removing rightmost digit until 0
            if(n == 8) return 1;    //final check to see if num = 8
            else return 0;          // if not return 0
        }
        else {
            if (n % 10 == 8) {
				if((n / 10) % 10 == 8) {
					return 2 + count8(n/10);
				}
				return 1 + count8(n / 10); //if the rightmost number == 8, return 1, remove rightmost number.
			} 
            else return count8(n / 10);                 //otherwise simply just remove rightmost number. 
        }
    }

	
	public static void main(String[] args)
	{
		testCase(8, 1);
		testCase(818, 2);
		testCase(8818, 4);
		testCase(8088, 4);
		testCase(123, 0);
		testCase(81238, 2);
		testCase(88788, 6);
		testCase(8234, 1);
		testCase(2348, 1);
		testCase(23884, 3);
		testCase(0, 0);
		testCase(1818188, 5);
		testCase(8818181, 5);
		testCase(1080, 1);
		testCase(188, 3);
		testCase(88888, 9);
		testCase(9898, 2);
		testCase(78, 1);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int expected)
	{
		String r;
		try
		{
			r = ""+ count8(a);
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
