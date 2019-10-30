import java.util.HashSet;
import java.util.Set;
/* Subarray given sum using hashing algorithm. */
class Util
{
	// Function to check if sub-array with given sum exists in
	// the array or not
	public static boolean findSubarray(int[] A, int sum)
	{
		// create an empty set
		Set<Integer> set = new HashSet<>();

		// insert number 0 into the set to handle the case when
		// sub-array with given sum starts from index 0
		set.add(0);

		// maintains sum of elements so far
		int sum_so_far = 0;

		// traverse the given array
		for (int i: A)
		{
			// update sum_so_far
			sum_so_far += i;

			// if (sum_so_far - sum) is seen before, we have found
			// the sub-array with sum 'sum'
			if (set.contains(sum_so_far - sum)) {
				return true;
			}

			// else insert sum of elements so far into the set
			set.add(sum_so_far);
		}

		// we reach here when no sub-array exists
		return false;
	}

	// main function
	public static void main(String[] args)
	{
		// array of integers
		int[] A = { 0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10 };
		int sum = -3;

		if (findSubarray(A, sum)) {
			System.out.print("Sub-array with given sum exists");
		}
		else {
			System.out.print("Sub-array with given sum do not exist");
		}
	}
}