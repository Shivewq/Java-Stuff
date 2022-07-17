/*
 * CodingBat Java Activity "triangle" from Recursion-1 section.
 * codingbat.com
 */

public class Triangle 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "triangle";
	
	/*
	 * INSTRUCTIONS
	 * We have triangle made of blocks. The topmost row has 1 block, the next row 
	 * down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively 
	 * (no loops or multiplication) the total number of blocks in such a triangle 
	 * with the given number of rows.
	 * 
	 * triangle(0) -> 0
	 * triangle(1) -> 1
	 * triangle(2) -> 3
	 */
	public static int triangle(int rows)
	{
		//put your code ONLY here!
        if(rows == 0) return 0;
        else if(rows == 1) return 1;
        else { 
            return rows + triangle(rows - 1);
        }
    }
	
	public static void main(String[] args)
	{
		testCase(0, 0);
		testCase(1, 1);
		testCase(2, 3);
		testCase(3, 6);
		testCase(4, 10);
		testCase(5, 15);
		testCase(6, 21);
		testCase(7, 28);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int a, int expected)
	{
		String r;
		try
		{
			r = ""+ triangle(a);
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
