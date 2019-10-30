/* Subarray given sum using sliding window algorithm. */
class Util
{
	// Function to print sub-array having given sum using
	// sliding window technique
	public static void findSubarray(int[] A, int sum)
	{
		// maintains sum of current window
		int windowSum = 0;

		// maintain a window [low, high-1]
		int low = 0, high = 0;

		// consider every sub-array starting from low index
		for (low = 0; low < A.length; low++)
		{
			// if current window's sum is less than the given sum,
			// then add elements to current window from right
			while (windowSum < sum && high < A.length)
			{
				windowSum += A[high];
				high++;
			}

			// if current window's sum is equal to the given sum
			if (windowSum == sum)
			{
				System.out.printf("Subarray found [%d-%d]\n", low, high - 1);
				return;
			}

			// At this point the current window's sum is more than the given
			// sum remove current element (leftmost element) from the window
			windowSum -= A[low];
		}
	}

	// main function
	public static void main(String[] args)
	{
		// array of positive integers
		int[] A = { 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 };
		int sum = 15;

		findSubarray(A, sum);
	}
}