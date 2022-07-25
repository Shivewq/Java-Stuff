import java.util.Arrays;

/*
 * CodingBat Java Activity "sumHeights2" from AP-1 section.
 * codingbat.com
 */

public class SumHeights2 
{
	private static int failures = 0;
	private static final String METHOD_NAME = "sumHeights2";
	
	/*
	 * INSTRUCTIONS
	 *  We have an array of heights, 
	 * representing the altitude along a walking trail. Given start/end 
	 * indexes into the array, return the sum of the changes for a walk 
	 * beginning at the start index and ending at the end index, however 
	 * increases in height count double. For example, with the heights 
	 * {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. 
	 * The start end end index will both be valid indexes into the array 
	 * with start <= end.
	 * 
	 * sumHeights2([5, 3, 6, 7, 2], 2, 4) -> 7
	 * sumHeights2([5, 3, 6, 7, 2], 0, 1) -> 2
	 * sumHeights2([5, 3, 6, 7, 2], 0, 4) -> 15
	 */
	public static int sumHeights2(int[] heights, int start, int end)
	{
		//put your code ONLY here!
		int sum1 = 0;
		int sum2 = 0;

		for(int i = start; i < heights.length - 1; i++) {
			if(i < end) {
				System.out.println(heights[i]);
				if(heights[i] > heights[i + 1]) {
						sum1 = sum1 + (heights[i] - heights[i + 1]);
						System.out.println("sum1 " + sum1);
				}
				else if(heights[i] < heights[i + 1]) {
						sum2 = sum2 + (heights[i + 1] - heights[i]) * 2;
						System.out.println("sum2 " + sum2);
				}
			}
		}
		return sum1 + sum2;
	}
	
	public static void main(String[] args)
	{
		testCase(new int[] {5, 3, 6, 7, 2}, 2, 4, 7);
		testCase(new int[] {5, 3, 6, 7, 2}, 0, 1, 2);
		testCase(new int[] {5, 3, 6, 7, 2}, 0, 4, 15);
		testCase(new int[] {5, 3, 6, 7, 2}, 1, 1, 0);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3, 6);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8, 19);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8, 16);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8, 0);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2, 0);
		testCase(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6, 4);
		testCase(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 4, 1);
		testCase(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 5, 2);

		System.out.println();
		System.out.println(failures + " failed test cases.");
	}

	private static void testCase(int[] testValues, int a, int b, int result)
	{
		String r;
		String i = Arrays.toString(testValues);
		try
		{
			r = ""+sumHeights2(testValues, a, b);
			if (r.equals("" +result))
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
		System.out.println(METHOD_NAME+"("+i+") -> "+r + ", EXPECTED: "+ result);
	}

}

