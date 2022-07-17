/**
 * CodingBat Java Activity "firstLast6" from Array-1.
 * codingbat.com
 */
public class FirstLast6
{
	private static int failures = 0;
	private static final String METHOD_NAME = "firstLast6";

	/**
	 * INSTRUCTIONS:
	 * Given an array of ints, return true if 6 appears as either the first or 
	 * last element in the array. The array will be length 1 or more.
	 * 
	 * firstLast6([1, 2, 6] -> true
	 * firstLast6([6, 1, 2, 3] -> true
	 * firstLast6([13, 6, 1, 2, 3] -> false
	 * 
	 */
	public static boolean firstLast6(int[] nums)
	{
		// ADD YOUR CODE HERE
		if(nums[0] == 6 || nums[nums.length - 1] == 6){ //use .length to get max value of any array, 
			return true;								// -1 to get last index 
		}
		return false;
	}

	public static void main(String[] args)
	{
		testCase(new int[]{1, 2, 6}, true);
		testCase(new int[]{6, 1, 2, 3}, true);
		testCase(new int[]{13, 6, 1, 2, 3}, false);
		testCase(new int[]{13, 6, 1, 2, 6}, true);
		testCase(new int[]{3, 2, 1}, false);
		testCase(new int[]{3, 6, 1}, false);
		testCase(new int[]{3, 6}, true);
		testCase(new int[]{6}, true);
		testCase(new int[]{3}, false);
		testCase(new int[]{5, 6}, true);
		testCase(new int[]{5, 5}, false);
		testCase(new int[]{1, 2, 3, 4, 6}, true);
		testCase(new int[]{1, 2, 3, 4}, false);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] a, boolean result)
	{
		String r;
		try
		{
			r = ""+firstLast6(a);
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
		System.out.println(METHOD_NAME+"("+a+") -> "+r + ", EXPECTED: "+result);
	}

}
