/* Boolean array, this algorithm find the maximum sequence of continuous 1's that can be
formed by replacing at-most k zeroes by ones. */
class Util
{
	// Function to find the maximum sequence of continuous 1's by replacing
	// atmost k 0's by 1 using sliding window technique
	public static void longestSeq(int[] A, int k)
	{
		int left = 0;    // left represents current window's starting index
		int count = 0;   // stores number of zeros in current window
		int window = 0;  // stores maximum number of continuous 1's found
						 // so far (including k zeroes)

		int leftIndex = 0;  // store left index of max window found so far

		// maintain a window [left..right] containing at-most k zeroes
		for (int right = 0; right < A.length; right++)
		{
			// if current element is 0, increase count of zeros in the
			// current window by 1
			if (A[right] == 0) {
				count++;
			}

			// window becomes unstable if number of zeros in it becomes
			// more than
			while (count > k)
			{
				// if we have found zero, decrement number of zeros in the
				// current window by 1
				if (A[left] == 0) {
					count--;
				}

				// remove elements from the window's left side till window
				// becomes stable again
				left++;
			}

			// when we reach here, the window [left..right] contains at-most
			// k zeroes and we update max window size and leftmost index
			// of the window
			if (right - left + 1 > window)
			{
				window = right - left + 1;
				leftIndex = left;
			}
		}

		// print maximum sequence of continuous 1's
		System.out.println("The longest sequence has length " + window
							+ " from index " + leftIndex + " to " 
							+ (leftIndex + window - 1));
	}

	// main function
	public static void main(String[] args)
	{
		int[] A = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
		int k = 2;

		longestSeq(A, k);
	}
}