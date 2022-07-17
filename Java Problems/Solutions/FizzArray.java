import java.util.Arrays;

/*
 * CodingBat Java Activity "fizzArray" from Array-2 section.
 * codingbat.com
 */

public class FizzArray 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "fizzArray";
	
	/*
	 * INSTRUCTIONS
	 * Given a number n, create and return a new int array of length n, 
	 * containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in 
	 * which case just return a length 0 array. You do not need a separate 
	 * if-statement for the length-0 case; the for-loop should naturally 
	 * execute 0 times in that case, so it just works. The syntax to make a 
	 * new int array is: new int[desired_length] 
	 * 
	 * fizzArray(4) -> [0, 1, 2, 3]
	 * fizzArray(1) -> [0]
	 * fizzArray(10) -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 */
	public static int[] fizzArray(int nums)
	{
		//put your code ONLY here!
        int arr[] = {};

        arr = new int[nums]; //delcare array type & length based on "nums" given
        
        for(int i = 0; i < arr.length; i++){ // iterate through each element through the array
            arr[i] = i;
        }

        return arr;


	}
	
	public static void main(String[] args)
	{
		testCase(4, new int[] {0, 1, 2, 3});
		testCase(1, new int[] {0});
		testCase(10, new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
		testCase(0, new int[] {});
		testCase(2, new int[] {0, 1});
		testCase(7, new int[] {0, 1, 2, 3, 4, 5, 6});
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int testValue, int[] expected)
	{
		String r;
		String i = Arrays.toString(expected);
		try
		{
			r = Arrays.toString(fizzArray(testValue));
			if (r.equals(i))
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
		System.out.println(METHOD_NAME+"("+testValue+") -> "+r + ", EXPECTED: " + i);
	}

}
