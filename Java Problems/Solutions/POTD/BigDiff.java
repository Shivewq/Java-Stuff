import java.util.Arrays;

/*
 * CodingBat Java Activity "bigDiff" from Array-2 section.
 * codingbat.com
 */

public class BigDiff 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "bigDiff";
	
	/*
	 * INSTRUCTIONS
	 * Given an array length 1 or more of ints, return the difference between 
	 * the largest and smallest values in the array. 
	 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return 
	 * the smaller or larger of two values.
	 * 
	 * bigDiff([10, 3, 5, 6]) -> 7
	 * bigDiff([7, 2, 10, 9]) -> 8
	 * bigDiff([2, 10, 7, 2]) -> 8
	 */
	public static int bigDiff(int[] nums)
	{
		//put your code ONLY here!
        int maxValue = nums[0];
        int minValue = nums[0];

        for(int i = 0; i <= nums.length-1; i++){
            if(maxValue < nums[i]) maxValue = nums[i];
            if(minValue > nums[i]) minValue = nums[i];
        }

        int difference = (maxValue - minValue);

        return difference;
    }
	public static void main(String[] args)
	{
		testCase(new int[] {10, 3, 5, 6}, 7);
		testCase(new int[] {7, 2, 10, 9}, 8);
		testCase(new int[] {2, 10, 7, 2}, 8);
		testCase(new int[] {2, 10}, 8);
		testCase(new int[] {10, 2}, 8);
		testCase(new int[] {2, 3}, 1);
		testCase(new int[] {2, 2}, 0);
		testCase(new int[] {2}, 0);
		testCase(new int[] {5, 1, 6, 1, 9, 9}, 8);
		testCase(new int[] {7, 6, 8, 5}, 3);
		testCase(new int[] {7, 7, 6, 8, 5, 5, 6}, 3);
		
		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+bigDiff(testValues);
			if (r.equals(""+result))
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
		System.out.println(METHOD_NAME+"("+i+") -> "+r + ", EXPECTED: "+result);
	}

}

