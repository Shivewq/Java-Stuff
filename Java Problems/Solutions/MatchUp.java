import java.util.Arrays;

/*
 * CodingBat Java Activity "matchUp" from Array-2 section.
 * codingbat.com
 */

public class MatchUp 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "matchUp";
	
	/*
	 * INSTRUCTIONS
	 * Given arrays nums1 and nums2 of the same length, for every element in nums1, 
	 * consider the corresponding element in nums2 (at the same index). Return the 
	 * count of the number of times that the two elements differ by 2 or less, but are not equal.
	 * 
	 * matchUp([1, 2, 3], [2, 3, 10]) -> 2
	 * matchUp([1, 2, 3], [2, 3, 5]) -> 3
	 * matchUp([1, 2, 3], [2, 3, 3]) -> 2
	 */
	public static int matchUp(int[] nums1, int[] nums2)
	{
		//put your code ONLY here!
        // Iterate through only 1 arr as both arrays are of same length:
        int count = 0;
        for(int i = 0; i < nums1.length; i++){ 
				//Math.abs to get absolute value to avoid the negative numbers (as if you're subtracting the largest num)
        	if (Math.abs(nums2[i] - nums1[i]) <= 2 && Math.abs(nums2[i] - nums1[i]) > 0) count += 1;
            
        }
        return count;
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {1, 2, 3}, new int[] {2, 3, 10}, 2);
		testCase(new int[] {1, 2, 3}, new int[] {2, 3, 5}, 3);
		testCase(new int[] {1, 2, 3}, new int[] {2, 3, 3}, 2);
		testCase(new int[] {5, 3}, new int[] {5, 5}, 1);
		testCase(new int[] {5, 3}, new int[] {4, 4}, 2);
		testCase(new int[] {5, 3}, new int[] {3, 3}, 1);
		testCase(new int[] {5, 3}, new int[] {2, 2}, 1);
		testCase(new int[] {5, 3}, new int[] {1, 1}, 1);
		testCase(new int[] {5, 3}, new int[] {0, 0}, 0);
		testCase(new int[] {4}, new int[] {4}, 0);
		testCase(new int[] {4}, new int[] {5}, 1);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValue1, int[] testValue2, int expected)
	{
		String r;
		String i = "" + expected;
		try
		{
			r = "" + (matchUp(testValue1, testValue2));
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
		System.out.println(METHOD_NAME+"("+ Arrays.toString(testValue1) + ", " + Arrays.toString(testValue2)+") -> "+r + ", EXPECTED: " + expected);
	}

}