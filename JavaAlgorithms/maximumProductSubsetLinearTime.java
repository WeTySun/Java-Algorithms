/*Linear time solution */
class Util
{
	// Function to return maximum product of a subset of given array
	public static int maxProduct(int[] A, int n)
	{
		// base case
		if (n == 0) {
			return 0;
		}

		// if array contains only one element
		if (n == 1) {
			return A[0];
		}

		int product = 1;		// to store maximum product subset

		// stores the negative element having minimum absolute value
		// in the set
		int abs_min_so_far = Integer.MAX_VALUE;

		// maintain count of negative elements in the set
		int negative = 0;

		// maintain count of positive elements in the set
		int positive = 0;

		boolean contains_zero = false;

		// traverse the given array
		for (int i = 0; i < n; i++)
		{
			// if current element is negative
			if (A[i] < 0) {
				negative++;
				abs_min_so_far = Integer.min(abs_min_so_far, Math.abs(A[i]));
			}
			// if current element is positive
			else if (A[i] > 0) {
				positive++;
			}

			// if current element is zero
			if (A[i] == 0) {
				contains_zero = true;
			} else {
				product = product * A[i];
			}
		}

		// if odd number of negative elements are present, exclude the
		// negative element having minimum absolute value from the subset
		if ((negative & 1) != 0) {
			product = product / -abs_min_so_far;
		}

		// special case - set contains one negative element and
		// one or more zeroes
		if (negative == 1 && positive == 0 && contains_zero) {
			product = 0;
		}

		// return maximum product
		return product;
	}

	// main function
	public static void main(String[] args)
	{
		int[] A = { -6, 4, -5, 8, -10, 0, 8 };

		System.out.print("The maximum product of a subset is "
						+ maxProduct(A, A.length));
	}
}